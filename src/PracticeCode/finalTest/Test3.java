package newCode.major.PracticeCode.finalTest;

import javax.swing.*;
import java.awt.*;

public class Test3 extends JFrame {
    public Test3(String title) {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle(title);
        setSize(300, 150);

        Container pane = getContentPane();
        pane.setBackground(Color.PINK);
        setVisible(true);
    }

    public void addButton() {
        JButton btn1 = new JButton("버튼");
        add(btn1);
        setVisible(true);
    }
    public static void main(String[] args) {
        Test3 t = new Test3("연습3");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t.addButton();
    }
}
