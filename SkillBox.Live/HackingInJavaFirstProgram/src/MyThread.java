import com.dropbox.core.v2.DbxClientV2;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyThread extends Thread {
    private DbxClientV2 clientV2;
    private BufferedImage image;

    SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd_HHmmss");
    Date now = new Date();

    public MyThread(DbxClientV2 clientV2, BufferedImage image) {
        this.clientV2 = clientV2;
        this.image = image;
    }

    @Override
    public void run() {
        try {
            ByteArrayOutputStream outputScreen = new ByteArrayOutputStream();
            ImageIO.write(image, "png", outputScreen);
            InputStream in = new ByteArrayInputStream(outputScreen.toByteArray());
            clientV2.files().uploadBuilder("/" + formatter.format(now) + ".png").uploadAndFinish(in);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}