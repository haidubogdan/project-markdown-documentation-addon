package org.netbeans.modules.markdown.editor.parser;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Date;
import org.openide.filesystems.AbstractFileSystem;
import org.openide.filesystems.DefaultAttributes;
/**
 *
 * @author bhaidu
 */
 class FakeFileSystem extends AbstractFileSystem
            implements AbstractFileSystem.Info, AbstractFileSystem.List, AbstractFileSystem.Change {

        String dir = "dir";

        @SuppressWarnings(value = "LeakingThisInConstructor")
        public FakeFileSystem() {
            this.info = this;
            this.list = this;
            this.change = this;
            this.attr = new DefaultAttributes(info, change, list);
        }

        @Override
        public String getDisplayName() {
            return "Fake FS";
        }

        @Override
        public boolean isReadOnly() {
            return true;
        }

        @Override
        public Date lastModified(String name) {
            return new Date(5000L);
        }

        @Override
        public boolean folder(String name) {
            return dir.equals(name);
        }

        @Override
        public boolean readOnly(String name) {
            return false;
        }

        @Override
        public String mimeType(String name) {
            return "text/x-markdown";
        }

        @Override
        public long size(String name) {
            return 0;
        }

        @Override
        public InputStream inputStream(String name) throws FileNotFoundException {
            return new ByteArrayInputStream(new byte[0]);
        }

        @Override
        public OutputStream outputStream(String name) throws IOException {
            return new ByteArrayOutputStream();
        }

        @Override
        public void lock(String name) throws IOException {
        }

        @Override
        public void unlock(String name) {
        }

        @Override
        public void markUnimportant(String name) {
        }

        @Override
        public String[] children(String f) {
            if ("".equals(f)) {
                return new String[]{dir};
            } else {
                return new String[]{"x.txt"};
            }
        }

        @Override
        public void createFolder(String name) throws IOException {
            throw new IOException();
        }

        @Override
        public void createData(String name) throws IOException {
            throw new IOException();
        }

        @Override
        public void rename(String oldName, String newName) throws IOException {
        }

        @Override
        public void delete(String name) throws IOException {
            throw new IOException();
        }

    }
