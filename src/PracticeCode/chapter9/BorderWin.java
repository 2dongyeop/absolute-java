package newCode.major.PracticeCode.chapter9;

import javax.swing.*;
import java.awt.*;

public class BorderWin extends JFrame {
    private static final long serialVersionUID = 1L;
    private JButton btn1, btn2, btn3, btn4, btn5;

    public BorderWin(String title) {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 180);
        setTitle(title);

        setLayout(new BorderLayout(30, 20));
        btn1 = new JButton("North");
        btn2 = new JButton("South");
        btn3 = new JButton("West");
        btn4 = new JButton("East");
        btn5 = new JButton("Center");

        add(btn1, "North");
        add(btn2, BorderLayout.SOUTH);
        add(btn3, "West");
        add(btn4, "East");
        add(btn5, "Center");
        setVisible(true);
    }

    public static void main(String[] args) {
        BorderWin win = new BorderWin("BorderLayout 윈도우");
    }
}
