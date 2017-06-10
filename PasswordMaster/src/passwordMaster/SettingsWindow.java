/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passwordMaster;

import java.awt.Dimension;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 * @see <a href="https://tips4java.wordpress.com/2008/10/20/table-select-all-editor/">RXTable</a>
 * @author Nikos
 */
public class SettingsWindow extends javax.swing.JFrame {

    private static final Logger LOG = Logger.getLogger(SettingsWindow.class.getName());

    private MainWindow mw;

    /**
     *
     */
    public Settings s;

    /**
     * Creates new form SettingsWindow
     *
     * @param mw
     */
    public SettingsWindow(MainWindow mw) {
        s = new Settings();
        this.mw = mw;
        initComponents();
        initThemeChange();
        initSettings();
        importSettings();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        changeEncKeyButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        themeComboBox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        fileManagerButton = new javax.swing.JButton();
        directoryField = new javax.swing.JTextField();
        defaultDirectoryButton = new javax.swing.JButton();
        closeButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        idleSecondsTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        changeEncKeyButton.setText("Change Encryption Key");
        changeEncKeyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeEncKeyButtonActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        themeComboBox.setBorder(null);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Theme Chooser");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(themeComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(themeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Select Directory:");

        fileManagerButton.setText("File Manager");
        fileManagerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileManagerButtonActionPerformed(evt);
            }
        });

        directoryField.setEditable(false);
        directoryField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        directoryField.setText("user.dir");
        directoryField.setBorder(null);

        defaultDirectoryButton.setText("Default Directory");
        defaultDirectoryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                defaultDirectoryButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(defaultDirectoryButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(fileManagerButton))
                            .addComponent(directoryField))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(directoryField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fileManagerButton)
                    .addComponent(defaultDirectoryButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        closeButton.setText("Close");
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });

        jButton1.setText("Default Window Size");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Hide passwords after seconds of inactivity(0 to disable):");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
                    .addComponent(idleSecondsTextField))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(idleSecondsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(changeEncKeyButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(closeButton))
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(changeEncKeyButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(closeButton)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void changeEncKeyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeEncKeyButtonActionPerformed
        mw.changeEncryptionKey();
    }//GEN-LAST:event_changeEncKeyButtonActionPerformed

    private void fileManagerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileManagerButtonActionPerformed
        JFileChooser jfc = new JFileChooser();
        if (s.userDir.equals("")) {
            jfc.setCurrentDirectory(new File(System.getProperty(s.defaultDir)));
        } else {
            jfc.setCurrentDirectory(new File(s.userDir));
        }
        jfc.setMultiSelectionEnabled(false);
        jfc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

        int returnVal = jfc.showOpenDialog(null);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = jfc.getSelectedFile();
            if (!file.exists()) {
                file.mkdir();
            }
            updateDirectory(file.getPath());
        }
    }//GEN-LAST:event_fileManagerButtonActionPerformed

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        saveSettings();
        setVisible(false);
    }//GEN-LAST:event_closeButtonActionPerformed

    private void defaultDirectoryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_defaultDirectoryButtonActionPerformed
        updateDirectory(s.defaultDir);
    }//GEN-LAST:event_defaultDirectoryButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        updateWindowSize(s.defaultSize);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton changeEncKeyButton;
    private javax.swing.JButton closeButton;
    private javax.swing.JButton defaultDirectoryButton;
    private javax.swing.JTextField directoryField;
    private javax.swing.JButton fileManagerButton;
    private javax.swing.JTextField idleSecondsTextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JComboBox<String> themeComboBox;
    // End of variables declaration//GEN-END:variables

    boolean themeChanging = false;

    private void initThemeChange() {
        themeComboBox.removeAllItems();
        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
            themeComboBox.addItem(info.getName());
            if (UIManager.getSystemLookAndFeelClassName().equals(info.getClassName())) {
                s.setTheme(info.getName());
            }
        }

        themeComboBox.setSelectedItem(s.getTheme());
        themeComboBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (!themeChanging) {
                    String theme = themeComboBox.getItemAt(themeComboBox.getSelectedIndex());
                    try {
                        updateTheme(theme);
                    } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
                        LOG.log(java.util.logging.Level.SEVERE, null, ex);
                    }
                }
            }
        });
    }

    private void initSettings() {
        setTitle(Settings.app_name + " v" + Settings.version + " - " + Settings.settings_name);
        setLocationRelativeTo(null);
        setResizable(false);
        WindowListener exitListener = new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                setVisible(false);
            }
        };
        addWindowListener(exitListener);
        idleSecondsTextField.getDocument().addDocumentListener(new DocumentListener() {
            public void changedUpdate(DocumentEvent e) {
                updateIdleSecondsFromTF();
            }

            public void removeUpdate(DocumentEvent e) {
                updateIdleSecondsFromTF();
            }

            public void insertUpdate(DocumentEvent e) {
                updateIdleSecondsFromTF();
            }
        });
    }

    private void updateTheme(String theme) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
            if (theme.equals(info.getName())) {
                javax.swing.UIManager.setLookAndFeel(info.getClassName());
                SwingUtilities.updateComponentTreeUI(SettingsWindow.this);
                setLocationRelativeTo(null);
                pack();

                mw.setLocationRelativeTo(null);
                SwingUtilities.updateComponentTreeUI(mw);
                mw.pack();
                mw.setExtendedState(s.getWindowState());

                SwingUtilities.updateComponentTreeUI(mw.ew);
                mw.ew.pack();
                mw.ew.setLocationRelativeTo(null);
                mw.ew.setResizable(false);
                mw.ew.setEnabled(false);

                s.setTheme(theme);
                themeChanging = true;
                themeComboBox.setSelectedItem(theme);
                themeChanging = false;
                break;
            }
        }
    }

    /**
     * This method saves the settings that are applied by the user.
     */
    public void saveSettings() {
        BufferedWriter bw = null;
        try {
            File settingsFile = new File(System.getProperty(s.defaultDir) + s.getFolderSlash() + "PasswordMaster.ini");
            if (!settingsFile.exists()) {
                settingsFile.createNewFile();
            }
            bw = new BufferedWriter(new FileWriter(settingsFile));
            bw.write(s.toString());
            System.out.println(s.toString());
            bw.close();
            mw.statusLabel.setText("Settings file saved successfully.");
        } catch (IOException ex) {
            LOG.log(Level.SEVERE, null, ex);
        }
    }

    public void updateDirectory(String userdir) {
        if (userdir == null) {
            directoryField.setText(s.defaultDir);
            s.setUserDir("");
        } else if (userdir.equals("")) {
            directoryField.setText(s.defaultDir);
            s.setUserDir("");
        } else {
            directoryField.setText(userdir);
            s.setUserDir(userdir);
        }
    }

    /**
     *
     * @param windowState
     */
    public void informWindowState(int windowState) {
        s.setWindowState(windowState);
    }

    private void updateWindowState(int windowState) {
        mw.pack();
        mw.setExtendedState(windowState);
        s.setWindowState(windowState);
    }

    private void importSettings() {
        BufferedReader br = null;
        try {
            File settingsFile = new File(System.getProperty(s.defaultDir) + "\\PasswordMaster.ini");
            if (settingsFile.exists()) {
                br = new BufferedReader(new FileReader(settingsFile));
                String string = br.readLine();
                while (true) {
                    String t = br.readLine();
                    if (t == null) {
                        break;
                    } else {
                        string += t;
                    }
                }
                s.fromString(string);
                br.close();
                applySettingsFromSettings();
            }
        } catch (IOException ex) {
            LOG.log(Level.SEVERE, null, ex);
        }
    }

    private boolean applyingSettings = false;

    private void applySettingsFromSettings() {
        try {
            applyingSettings = true;
            updateTheme(s.getTheme());
            updateWindowSize(s.getUserSize());
            updateWindowState(s.getWindowState());
            updateDirectory(s.getUserDir());
            updateIdleSeconds(s.getUserIdleSeconds());
            applyingSettings = false;
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            LOG.log(Level.SEVERE, null, ex);
        }
    }

    private void updateWindowSize(Dimension userSize) {
        mw.setPreferredSize(userSize);
        mw.setLocationRelativeTo(null);
    }

    private void updateIdleSeconds(int seconds) {
        idleSecondsTextField.setText(seconds + "");
    }

    private void updateIdleSecondsFromTF() {
        if (applyingSettings) {
            return;
        }
        Integer idleSeconds = s.defaultIdleSeconds;
        try {
            String idleSecondsSTR = idleSecondsTextField.getText();
            idleSeconds = new Integer(idleSecondsSTR);
        } catch (NumberFormatException ex) {
            idleSeconds = -1;
        }
        s.setUserIdleSeconds(idleSeconds);
    }
}
