import javax.swing.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import java.io.File;

import net.lingala.zip4j.core.ZipFile;

public class GUIForm {

    private JPanel rootPanel;
    private JTextField filePath;
    private JButton selectButton;
    private JButton actionButton;
    private File selectedFile;

    private boolean encryptedFileSelected = false;

    private String decryptAction = "Расшифровать";
    private String encryptAction = "Зашифровать";

    public GUIForm() {
        selectButton.addActionListener(new Action() {
            @Override
            public Object getValue(String key) {
                return null;
            }

            @Override
            public void putValue(String key, Object value) {

            }

            @Override
            public void setEnabled(boolean b) {

            }

            @Override
            public boolean isEnabled() {
                return false;
            }

            @Override
            public void addPropertyChangeListener(PropertyChangeListener listener) {

            }

            @Override
            public void removePropertyChangeListener(PropertyChangeListener listener) {

            }

            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser chooser = new JFileChooser();
                chooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
                chooser.showOpenDialog(rootPanel);
                selectedFile = chooser.getSelectedFile();
                onFileSelect();
            }
        });

        actionButton.addActionListener(new Action() {
            @Override
            public Object getValue(String key) {
                return null;
            }

            @Override
            public void putValue(String key, Object value) {

            }

            @Override
            public void setEnabled(boolean b) {

            }

            @Override
            public boolean isEnabled() {
                return false;
            }

            @Override
            public void addPropertyChangeListener(PropertyChangeListener listener) {

            }

            @Override
            public void removePropertyChangeListener(PropertyChangeListener listener) {

            }

            @Override
            public void actionPerformed(ActionEvent e) {
                if (selectedFile == null) {
                    return;
                }
                String password = JOptionPane.showInputDialog("Введите пароль:");
                if (password == null || password.length() == 0) {
                    showWarning("Пароль не указан!");
                    return;
                }
                if (encryptedFileSelected) {
                    decryptFile(password);
                } else {
                    encryptFile(password);
                }
            }
        });
    }

    public JPanel getRootPanel() {
        return rootPanel;
    }

    public void setButtonEnabled(boolean enabled) {
        selectButton.setEnabled(enabled);
        actionButton.setEnabled(enabled);
    }

    private void encryptFile(String password) {
        EncryptorThread thread = new EncryptorThread(this);
        thread.setFile(selectedFile);
        thread.setPassword(password);
        thread.start();
    }

    private void decryptFile(String password) {
        DecryptorThread thread = new DecryptorThread(this);
        thread.setFile(selectedFile);
        thread.setPassword(password);
        thread.start();
    }

    private void onFileSelect() {
        if (selectedFile == null) {
            filePath.setText("");
            actionButton.setVisible(false);
            return;
        }
        filePath.setText(selectedFile.getAbsolutePath());
        try {
            ZipFile zipFile = new ZipFile(selectedFile);
            encryptedFileSelected = zipFile.isValidZipFile() && zipFile.isEncrypted();
            actionButton.setText(encryptedFileSelected ? decryptAction : encryptAction);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        actionButton.setVisible(true);
    }

    public void showWarning(String message) {
        JOptionPane.showMessageDialog(rootPanel, message,
                "Ошибка", JOptionPane.WARNING_MESSAGE);
    }

    public void showFinished() {
        JOptionPane.showMessageDialog(rootPanel, encryptedFileSelected ? "Расшифровка завершена" : "Шифрование завершено",
                "Завершено", JOptionPane.WARNING_MESSAGE);
    }

}