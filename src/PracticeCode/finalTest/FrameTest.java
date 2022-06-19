package newCode.major.PracticeCode.finalTest;

import javax.swing.*;
import java.awt.*;

public class FrameTest extends JFrame {
    public FrameTest(String title) {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setTitle(title);
        setVisible(true);
    }

    public void decorate() {
        Container pane = getContentPane();
        pane.setBackground(Color.YELLOW);
    }

    public static void main(String[] args) {
        FrameTest ft = new FrameTest("기말 화이팅");

        try {
            Thread.sleep(1000);
        } catch (Exception e) { }

        ft.decorate();
    }
}
