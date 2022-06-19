package newCode.major.PracticeCode.finalTest;

import javax.swing.*;
import java.awt.*;

public class Test4 extends JFrame {
    private static final long serialVersionUID = 1L;
    private JButton btn1, btn2, btn3, btn4, btn5;

    public Test4(String title) {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle(title);
        setSize(300, 180);
        setVisible(true);
    }

    public void addButton() {
        setLayout(new BorderLayout());

        btn1 = new JButton("북");
        btn2 = new JButton("남");
        btn3 = new JButton("동");
        btn4 = new JButton("서");
        btn5 = new JButton("중앙");

        add(btn1, "North");
        add(btn2, "South");
        add(btn3, "East");
        add(btn4, "West");
        add(btn5, "Center");
        setVisible(true);
    }

    public static void main(String[] args) {
        Test4 t = new Test4("연습4");

        t.addButton();
    }
}
