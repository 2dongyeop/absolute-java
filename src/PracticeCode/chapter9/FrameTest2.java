package newCode.major.PracticeCode.chapter9;

import javax.swing.*;
import java.awt.*;

class FirstMyFrame2 extends JFrame {
    private static final long serialVersionUID = 1L;

    public FirstMyFrame2(String title) {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 150);
        setTitle(title);
        setVisible(true);
    }

    public void decorate() {
        Container pane = getContentPane();
        pane.setBackground(Color.yellow);
    }
}

public class FrameTest2 {
    public static void main(String[] args) {
        FirstMyFrame2 f = new FirstMyFrame2("첫 윈도 프로그램");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {};

        f.decorate();
    }
}
