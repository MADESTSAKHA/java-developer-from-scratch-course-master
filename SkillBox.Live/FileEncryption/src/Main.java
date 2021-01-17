/* https://go.skillbox.ru/profession/professiya-java-dev-pro/vorkshopy-i-vebinary-java-razrabotchik-pro/ccae9f7f-5e3e-4973-a961-f763b0b4d65b/videolesson
59:09 */

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

public class Main {
    public static void main(String[] args) {

                                                                                                //Разархивировать папку.
        String path = "C:/Users/MADESTSAKHA/Desktop/";
        String in = path + "archive.zip";
        String out = path + "result/";

        try {
            FileInputStream inputStream = new FileInputStream(in);
            ZipInputStream zipInput = new ZipInputStream(inputStream);
            while (true) {
                ZipEntry entry = zipInput.getNextEntry();
                if (entry == null) {
                    break;
                }
                File file = new File(out + entry.getName());
                if (entry.isDirectory()) {
                    file.mkdirs();
                } else {
                    byte[] bytes = zipInput.readAllBytes();
                    Files.write(Paths.get(file.getAbsolutePath()), bytes, StandardOpenOption.CREATE);
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void writeFileToZip(File file, ZipOutputStream zipOut, String path) throws Exception {
        if (file.isDirectory()) {
            String folder = path + file.getName() + "/";
            ZipEntry entry = new ZipEntry(folder);
            zipOut.putNextEntry(entry);
            zipOut.closeEntry();
            File[] files = file.listFiles();
            for (File subfile : files) {
                writeFileToZip(subfile, zipOut, folder);
            }
            return;
        }
        ZipEntry entry = new ZipEntry(path + file.getName());
        zipOut.putNextEntry(entry);
        byte[] bytes = Files.readAllBytes(Paths.get(file.getAbsolutePath()));
        zipOut.write(bytes);
    }
}
        /*
                                                                                                   //Архивировать папку.
        String path = "C:/Users/MADESTSAKHA/Desktop/";
        String in = path + "folder";
        String out = path + "archive.zip";

        try {
            FileOutputStream outputStream = new FileOutputStream(out);
            ZipOutputStream zipOut = new ZipOutputStream(outputStream);
            writeFileToZip(new File(in), zipOut, "");
            zipOut.flush();
            zipOut.close();
            outputStream.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void writeFileToZip(File file, ZipOutputStream zipOut, String path) throws Exception {
        if (file.isDirectory()) {
            String folder = path + file.getName() + "/";
            ZipEntry entry = new ZipEntry(folder);
            zipOut.putNextEntry(entry);
            zipOut.closeEntry();
            File[] files = file.listFiles();
            for (File subfile : files) {
                writeFileToZip(subfile, zipOut, folder);
            }
            return;
        }
        ZipEntry entry = new ZipEntry(path + file.getName());
        zipOut.putNextEntry(entry);
        byte[] bytes = Files.readAllBytes(Paths.get(file.getAbsolutePath()));
        zipOut.write(bytes);
    }
}
                                                                                            //Архивировать много файлов.
        String path = "C:/Users/MADESTSAKHA/Desktop/";
        String[] in = {"original.jpeg", "Test3.txt", "New Документ Microsoft Word.docx"};
        String out = path + "archive.zip";

        try {
            FileOutputStream outputStream = new FileOutputStream(out);
            ZipOutputStream zipOut = new ZipOutputStream(outputStream);
            for (String fileName : in) {
                File file = new File(path + fileName);
                ZipEntry entry = new ZipEntry(file.getName());
                zipOut.putNextEntry(entry);
                Path filePath = Paths.get(file.getAbsolutePath());
                byte[] date = Files.readAllBytes(filePath);
                zipOut.write(date);
            }
            zipOut.flush();
            zipOut.close();
            outputStream.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }

                                                                                                  //Архивировать 1 файл.
        String path = "C:/Users/MADESTSAKHA/Desktop/";
        String in = path + "original.jpeg";
        String out = path + "archive.zip";

        try {
            FileOutputStream outputStream = new FileOutputStream(out);
            ZipOutputStream zipOut = new ZipOutputStream(outputStream);
            ZipEntry entry = new ZipEntry(new File(in).getName());
            zipOut.putNextEntry(entry);
            byte[] date = Files.readAllBytes(Paths.get(in));
            zipOut.write(date);
            zipOut.flush();
            zipOut.close();
            outputStream.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        String path = "C:/Users/MADESTSAKHA/Desktop/original.jpeg";
        System.out.println("Write operation: \n");

        try {
            FileOutputStream outputStream = new FileOutputStream(path);
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 1; i <= 100; i++) {
                stringBuilder.append(i);
                if (i < 100) {
                    stringBuilder.append("\n");
                    if (i % 10 == 0) {
                        System.out.println(i + " %");
                    }
                }
            }
            outputStream.write(stringBuilder.toString().getBytes());
            outputStream.flush();
            outputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Write operation completed! \n");
        System.out.println("Next operation read: \n");

        try {
            StringBuilder stringBuilder = new StringBuilder();
            FileInputStream inputStream = new FileInputStream(path);  //С помощью него можно читать файлы по байтам!
            while (true) {
                int code = inputStream.read();
                if (code < 0) {
                    break;
                }
                stringBuilder.append((char) code);
            }
            inputStream.close();
            System.out.println(stringBuilder);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Next operation read: \n");

        try {
            String data = Files.readString(Paths.get(path));
            System.out.println(data);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Write operation: \n");
        try {
            Files.writeString(Paths.get(path), "\nHello world!", StandardOpenOption.APPEND);
            //.APPEND добавить в файл.
            //.CREATE создать новый файл.
        } catch (Exception e) {
            e.printStackTrace();
        }
*/