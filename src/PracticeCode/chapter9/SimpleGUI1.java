package newCode.major.PracticeCode.chapter9;

import javax.swing.*;

public class SimpleGUI1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JButton button = new JButton("click");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(button);

        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}
