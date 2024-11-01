package week2;

import javax.swing.JFrame;

public class window {
    public static void createWindow() {
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(500, 500);
        f.setVisible(true);
    }
}
