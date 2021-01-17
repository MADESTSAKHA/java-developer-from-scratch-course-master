import com.dropbox.core.DbxRequestConfig;
import com.dropbox.core.v2.DbxClientV2;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Main {
    public static void main(String[] args) {

        String ACCESS_TOKEN = "Bi1suyBlaE4AAAAAAAAAAeRpfPfz1LKELzv5CQ_GiZFTPeH-0E8JLus2oOpdln17";
        DbxRequestConfig config = DbxRequestConfig.newBuilder("dropbox/java-tutorial").build();
        DbxClientV2 client = new DbxClientV2(config, ACCESS_TOKEN);

        for (int i = 1; ; i++) {
            try {
                System.out.println("Скриншот № " + i);
                BufferedImage image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
                MyThread thread = new MyThread(client, image);
                thread.start();
                Thread.sleep(10000);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
}