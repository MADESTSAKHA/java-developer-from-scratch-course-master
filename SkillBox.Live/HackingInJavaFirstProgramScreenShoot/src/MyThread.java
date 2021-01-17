import com.dropbox.core.v2.DbxClientV2;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyThread extends Thread {
    DbxClientV2 client;
    BufferedImage image;
    SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd_HHmmss");
    Date now = new Date();

    public MyThread(DbxClientV2 client, BufferedImage image) {
        this.client = client;
        this.image = image;
    }

    @Override
    public void run() {
        ByteArrayOutputStream outputScreen = new ByteArrayOutputStream();
        try {
            ImageIO.write(image, "jpg", outputScreen);
            InputStream in = new ByteArrayInputStream(outputScreen.toByteArray());
            client.files().uploadBuilder("/" + formatter.format(now) + ".jpg").uploadAndFinish(in);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}