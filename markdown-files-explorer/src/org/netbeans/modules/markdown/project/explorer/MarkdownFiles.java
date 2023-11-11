/*
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
 * Copyright 2016 Oracle and/or its affiliates. All rights reserved.
 *
 * Oracle and Java are registered trademarks of Oracle and/or its affiliates.
 * Other names may be trademarks of their respective owners.
 *
 * The contents of this file are subject to the terms of either the GNU
 * General Public License Version 2 only ("GPL") or the Common
 * Development and Distribution License("CDDL") (collectively, the
 * "License"). You may not use this file except in compliance with the
 * License. You can obtain a copy of the License at
 * http://www.netbeans.org/cddl-gplv2.html
 * or nbbuild/licenses/CDDL-GPL-2-CP. See the License for the
 * specific language governing permissions and limitations under the
 * License.  When distributing the software, include this License Header
 * Notice in each file and include the License file at
 * nbbuild/licenses/CDDL-GPL-2-CP.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the GPL Version 2 section of the License file that
 * accompanied this code. If applicable, add the following below the
 * License Header, with the fields enclosed by brackets [] replaced by
 * your own identifying information:
 * "Portions Copyrighted [year] [name of copyright owner]"
 *
 * If you wish your version of this file to be governed by only the CDDL
 * or only the GPL Version 2, indicate your decision by adding
 * "[Contributor] elects to include this software in this distribution
 * under the [CDDL or GPL Version 2] license." If you do not indicate a
 * single choice of license, a recipient has the option to distribute
 * your version of this file under either the CDDL, the GPL Version 2 or
 * to extend the choice of license to its licensees as provided above.
 * However, if you add GPL Version 2 code and therefore, elected the GPL
 * Version 2 license, then the option applies only if the new code is
 * made subject to such option by the copyright holder.
 *
 * Contributor(s):
 *
 * Portions Copyrighted 2016 Sun Microsystems, Inc.
 */
package org.netbeans.modules.markdown.project.explorer;

import java.awt.Image;
import java.util.ArrayList;
import java.util.List;
import org.openide.nodes.AbstractNode;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import org.netbeans.api.project.Project;
import org.netbeans.spi.project.ui.support.NodeFactory;
import org.netbeans.spi.project.ui.support.NodeList;
import org.openide.filesystems.FileObject;
import org.openide.filesystems.FileUtil;
import org.openide.loaders.DataFolder;
import org.openide.loaders.DataObject;
import org.openide.loaders.DataObjectNotFoundException;
import org.openide.nodes.FilterNode;
import org.openide.nodes.Node;
import org.openide.util.ChangeSupport;
import org.openide.nodes.Children;
import org.openide.util.Exceptions;

/**
 * Detect markdown files in project root
 * 
 * @author bogdan
 */
public class MarkdownFiles {

    @NodeFactory.Registration(projectType = "org-netbeans-modules-web-clientproject", position = 600)
    public static NodeFactory forHtml5Project() {
        return new MarkdownFilesNodeFactory();
    }

    @NodeFactory.Registration(projectType = "org-netbeans-modules-php-project", position = 400)
    public static NodeFactory forPhpProject() {
        return new MarkdownFilesNodeFactory();
    }

    @NodeFactory.Registration(projectType = "org-netbeans-modules-web-project", position = 310)
    public static NodeFactory forWebProject() {
        return new MarkdownFilesNodeFactory();
    }

    @NodeFactory.Registration(projectType = "org-netbeans-modules-maven", position = 610)
    public static NodeFactory forMavenProject() {
        return new MarkdownFilesNodeFactory();
    }
    
    @NodeFactory.Registration(projectType = "org-netbeans-modules-apisupport-project", position = 610)
    public static NodeFactory forNbModuleProject() {
        return new MarkdownFilesNodeFactory();
    }

    //~ Inner classes
    private static final class MarkdownFilesNodeFactory implements NodeFactory {

        @Override
        public NodeList<?> createNodes(Project project) {
            assert project != null;
            return new MdDocumentationFilesNodeList(project);
        }

    }

    private static final class MdDocumentationFilesNodeList implements NodeList<Node>, ChangeListener {

//        private final Project project;
//        private final ChangeSupport changeSupport = new ChangeSupport(this);
        private final List<FileObject> mdFiles = new ArrayList<>();

        MdDocumentationFilesNodeList(Project project) {
            //this.project = project;
            FileObject[] sourceFiles = project.getProjectDirectory().getChildren();
            for (FileObject file : sourceFiles) {
                if (file.getExt().equals("md")) {
                    mdFiles.add(file);
                }
            }
        }

        @Override
        public List<Node> keys() {
            List<Node> keysList = new ArrayList<>(1);
            if (!mdFiles.isEmpty()) {
                MarkdownFilesNodeList mdChildren = new MarkdownFilesNodeList(mdFiles);
                mdChildren.setKeys();
                keysList.add(new MdFileNode(mdChildren));
            }
            return keysList;
        }

        @Override
        public void addNotify() {

        }

        @Override
        public void removeNotify() {

        }

        @Override
        public void addChangeListener(ChangeListener cl) {

        }

        @Override
        public void removeChangeListener(ChangeListener cl) {

        }

        @Override
        public void stateChanged(ChangeEvent e) {

        }

        @Override
        public Node node(Node key) {
            return key;
        }
    }

    private static final class MarkdownFilesNodeList extends Children.Keys<FileObject> {

        List<FileObject> mdFiles = new ArrayList<>();

        MarkdownFilesNodeList(List<FileObject> mdFiles) {
            super(true);
            this.mdFiles = mdFiles;
        }

        @Override
        protected Node[] createNodes(FileObject file) {
            try {
                DataObject dobj = DataObject.find(file);
                FilterNode fn = new FilterNode(dobj.getNodeDelegate(), Children.LEAF);
                return new Node[]{fn};
            } catch (DataObjectNotFoundException ex) {
                Exceptions.printStackTrace(ex);
            }
            return null;
        }

        public void setKeys() {
            List<FileObject> keys = new ArrayList<>(mdFiles.size());
            keys.addAll(mdFiles);
            setKeys(keys);
        }
    }

    private static final class MdFileNode extends AbstractNode {

        private final Node iconDelegate;

        MdFileNode(MarkdownFilesNodeList markdownFiles) {
            super(markdownFiles);
            setDisplayName("Markdown Documentation files");
            iconDelegate = DataFolder.findFolder(FileUtil.getConfigRoot()).getNodeDelegate();
        }

        @Override
        public Image getIcon(int type) {
            return iconDelegate.getIcon(type);
        }
        
        @Override
        public Image getOpenedIcon(int type) {
            return iconDelegate.getIcon(type);
        }
    }
}
