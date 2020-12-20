import net.lingala.zip4j.core.ZipFile;
import net.lingala.zip4j.model.ZipParameters;

import java.io.File;

public class EncryptorThread extends Thread {
    private GUIForm form;
    private File file;
    private ZipParameters parameters;

    public EncryptorThread(GUIForm form) {
        this.form = form;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public void setPassword(String password) {
        parameters = ParametersContainer.getParameters();
        parameters.setPassword(password);
    }

    @Override
    public void run() {
        onStart();
        try {
            String archiveName = getArchiveName();
            ZipFile zipFile = new ZipFile(archiveName);
            if (file.isDirectory()) {
                zipFile.addFolder(file, parameters);
            }
        } catch (Exception ex) {
            form.showWarning(ex.getMessage());
        }
        onFinish();
    }

    private void onStart() {
        form.setButtonEnabled(false);
    }

    private void onFinish() {
        parameters.setPassword("");
        form.setButtonEnabled(true);
        form.showFinished();
    }

    private String getArchiveName() {
        for (int i = 1; ; i++) {
            String number = i > 1 ? Integer.toString(i) : "";
            String archiveName = file.getAbsolutePath() + number + ".enc";
            if (!new File(archiveName).exists()) {
                return archiveName;
            }
        }
    }
}
