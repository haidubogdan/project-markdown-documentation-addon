package org.netbeans.modules.markdown.editor.parser;

import java.io.IOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import javax.swing.text.Document;
import org.netbeans.api.editor.mimelookup.MimeLookup;
import org.netbeans.modules.parsing.api.Snapshot;
import org.netbeans.modules.parsing.api.Source;
import org.netbeans.modules.parsing.implspi.EnvironmentFactory;
import org.netbeans.modules.parsing.implspi.SchedulerControl;
import org.netbeans.modules.parsing.implspi.SourceControl;
import org.netbeans.modules.parsing.implspi.SourceEnvironment;
import org.netbeans.modules.parsing.spi.Parser;
import org.netbeans.modules.parsing.spi.ParserFactory;
import org.netbeans.modules.parsing.spi.Scheduler;
import org.openide.cookies.EditorCookie;
import org.openide.filesystems.FileObject;
import org.openide.loaders.DataObject;
import org.openide.util.Lookup;
import org.openide.util.lookup.ServiceProvider;

/**
 *
 * @author bhaidu
 */
@ServiceProvider(service = EnvironmentFactory.class, position = 50000)
public class TestEnvironmentFactory implements EnvironmentFactory {

    private static Map<String, Reference<Parser>> cachedParsers = new HashMap<String, Reference<Parser>>();

    @Override
    public Class<? extends Scheduler> findStandardScheduler(String schedulerName) {
        return null;
    }

    @Override
    public SourceEnvironment createEnvironment(Source src, SourceControl control) {
        return new Env(control);
    }

    @Override
    public <T> T runPriorityIO(Callable<T> r) throws Exception {
        return r.call();
    }

    @Override
    public Lookup getContextLookup() {
        return Lookup.getDefault();
    }

    @Override
    public synchronized Parser findMimeParser(Lookup context, String mimeType) {
        Reference<Parser> rp = cachedParsers.get(mimeType);
        Parser p = null;
        if (rp != null) {
            p = rp.get();
        }
        if (p != null) {
            return p;
        }
        ParserFactory f = MimeLookup.getLookup(mimeType).lookup(ParserFactory.class);
        if (f != null) {
            p = f.createParser(Collections.<Snapshot>emptyList());
        } else {
            p = MimeLookup.getDefault().lookup(ParserFactory.class).createParser(Collections.<Snapshot>emptyList());
        }
        cachedParsers.put(mimeType, new WeakReference<>(p));
        return p;
    }

    @Override
    public Collection<? extends Scheduler> getSchedulers(Lookup context) {
        return getContextLookup().lookupAll(Scheduler.class);
    }

    static class Env extends SourceEnvironment {

        public Env(SourceControl ctrl) {
            super(ctrl);
        }

        @Override
        public boolean isReparseBlocked() {
            return false;
        }

        @Override
        public Document readDocument(FileObject f, boolean forceOpen) throws IOException {
            DataObject d = DataObject.find(f);
            EditorCookie cake = d.getCookie(EditorCookie.class);
            if (!forceOpen) {
                return cake.getDocument();
            } else {
                return cake.openDocument();
            }
        }

        @Override
        public void attachScheduler(SchedulerControl s, boolean attach) {
            // FIXME - schedulers will not react if the source file changes
            // because of rename etc.
        }

        @Override
        public void activate() {
            listenOnFileChanges();
            listenOnParser();
        }
    }
}
