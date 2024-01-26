package org.netbeans.modules.markdown.editor.parser;

import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Date;
import java.util.Enumeration;
import org.openide.filesystems.FileChangeListener;
import org.openide.filesystems.FileLock;
import org.openide.filesystems.FileObject;
import org.openide.filesystems.FileStateInvalidException;
import org.openide.filesystems.FileSystem;

/**
 *
 * @author bhaidu
 */
public class FakeFileObject extends FileObject {

        InputStream stream;
        FileObject parent;

        public FakeFileObject(String text) {
            stream = new ByteArrayInputStream(text.getBytes());
        }

        @Override
        public String getName() {
            return "test";
        }

        @Override
        public String getExt() {
            return "md";
        }

        @Override
        public void rename(FileLock fl, String string, String string1) throws IOException {
            //
        }

        @Override
        public FileSystem getFileSystem() throws FileStateInvalidException {
            return new FakeFileSystem();
        }

        public void setParent(FileObject parent) {
            this.parent = parent;
        }

        @Override
        public FileObject getParent() {
            return parent;
        }

        @Override
        public boolean isFolder() {
            return false;
        }

        @Override
        public Date lastModified() {
            return new Date();
        }

        @Override
        public boolean isRoot() {
            return false;
        }

        @Override
        public boolean isData() {
            return false;
        }

        @Override
        public boolean isValid() {
            return true;
        }

        @Override
        public void delete(FileLock fl) throws IOException {
            //
        }

        @Override
        public Object getAttribute(String string) {
            return null;
        }

        @Override
        public void setAttribute(String string, Object o) throws IOException {
            //
        }

        @Override
        public Enumeration<String> getAttributes() {
            return null;
        }

        @Override
        public void addFileChangeListener(FileChangeListener fl) {
            //
        }

        @Override
        public void removeFileChangeListener(FileChangeListener fl) {
            //
        }

        @Override
        public long getSize() {
            return 1;
        }

        @Override
        public InputStream getInputStream() throws FileNotFoundException {
            return stream;
        }

        @Override
        public OutputStream getOutputStream(FileLock fl) throws IOException {
            return null;
        }

        @Override
        public FileLock lock() throws IOException {
            return null;
        }

        //deprecated
        @Override
        public void setImportant(boolean bln) {
            //
        }

        @Override
        public FileObject[] getChildren() {
            return new FileObject[0];
        }

        @Override
        public FileObject getFileObject(String string, String string1) {
            return null;
        }

        @Override
        public FileObject createFolder(String string) throws IOException {
            return null;
        }

        @Override
        public FileObject createData(String string, String string1) throws IOException {
            return null;
        }

        //deprecated
        @Override
        public boolean isReadOnly() {
            return true;
        }

    }
