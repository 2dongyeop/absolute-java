package newCode.major.PracticeCode.chapter9;

import javax.swing.*;

public class HelloJFrame extends JFrame {
    public HelloJFrame(String title) {
        setSize(300, 200);
        setTitle(title);
        setVisible(true);
    }

    public static void main(String[] args) {
        HelloJFrame f = new HelloJFrame("Hello JFrame");
    }
}
