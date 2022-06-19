package newCode.major.PracticeCode.chapter9.finalTest;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutWindow extends JFrame {
    private static final long serialVersionUID = 1L;
    private JButton btn1, btn2, btn3, btn4, btn5;

    public BorderLayoutWindow(String title) {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setTitle(title);
        
        setLayout(new BorderLayout(30, 20));
        btn1 = new JButton("North");
        btn2 = new JButton("South");
        btn3 = new JButton("West");
        btn4 = new JButton("East");
        btn5 = new JButton("Center");

        add(btn1, "North");

        setVisible(true);
    }

    public static void main(String[] args) {
        BorderLayoutWindow borderLayoutWindow = new BorderLayoutWindow("기말 뿌셔");
    }
}
