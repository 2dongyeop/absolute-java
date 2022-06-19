package newCode.major.PracticeCode.chapter9.finalTest;

import javax.swing.*;
import java.awt.*;

public class ComponentWindow extends JFrame {
    private static final long serialVersionUID = 1L;

    public ComponentWindow(String title) {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle(title);
        setSize(300, 300);
        setVisible(true);
        decorate();
    }

    public void decorate() {
        Container pane = getContentPane();
        pane.setBackground(Color.PINK);
    }

    public void addButton() {
        JButton button = new JButton("기말 화이팅");
        add(button);
        setVisible(true);
    }

    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);

        ComponentWindow f = new ComponentWindow("기말고사 가보자고");

        f.addButton();
    }
}
