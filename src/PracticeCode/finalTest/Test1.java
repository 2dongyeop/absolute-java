package newCode.major.PracticeCode.finalTest;

import javax.swing.*;

public class Test1 extends JFrame {
    public Test1(String title) {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle(title);
        setSize(300, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        Test1 t = new Test1("연습1");
    }
}
