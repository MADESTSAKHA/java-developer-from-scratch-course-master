/*
https://go.skillbox.ru/profession/professiya-java-dev-pro/vorkshopy-i-vebinary-java-razrabotchik-pro/ccae9f7f-5e3e-4973-a961-f763b0b4d65b/videolesson
3.20
*/

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("File Encryptor");
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        GUIForm form = new GUIForm();
        frame.add(form.getRootPanel());
        frame.setVisible(true);
    }
}