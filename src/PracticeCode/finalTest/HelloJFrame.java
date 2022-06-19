package newCode.major.PracticeCode.finalTest;

import javax.swing.*;

public class HelloJFrame extends JFrame {
    public HelloJFrame(String title) {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle(title);
        setSize(300, 180);
        setVisible(true);
    }

    public static void main(String[] args) {
        HelloJFrame helloJFrame = new HelloJFrame("hello~!");
    }
}
