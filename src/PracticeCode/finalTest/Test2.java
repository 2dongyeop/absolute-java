package newCode.major.PracticeCode.finalTest;

import javax.swing.*;
import java.awt.*;

public class Test2 extends JFrame {
    public Test2(String title) {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle(title);
        setSize(300, 150);
        setVisible(true);
    }

    public void decorate() {
        Container pane = getContentPane();
        pane.setBackground(Color.YELLOW);
    }

    public static void main(String[] args) {
        Test2 t = new Test2("연습2");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t.decorate();
    }
}
