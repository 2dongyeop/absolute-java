package newCode.major.PracticeCode.finalTest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyDrawPanel extends JPanel {
    @Override
    public void paintComponent(Graphics g) {
        g.setColor(java.awt.Color.yellow);
        g.fillRect(20, 50, 100, 100);
    }
}

public class Test5 extends JFrame {
    private static final long serialVersionUID = 1L;

    public Test5() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setVisible(true);
    }

    public void decorate() {
        Container pane = getContentPane();
        MyDrawPanel md = new MyDrawPanel();
        //md.setBackground(Color.YELLOW);
        add(md);
    }

    public static void main(String[] args) {
        Test5 t = new Test5();
        //t.decorate();
    }
}

