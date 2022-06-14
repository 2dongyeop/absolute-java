package newCode.major.assignment.week14;

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

public class Color extends JFrame implements ActionListener {
    private static final long serialVersionUID = 1L;
    private JButton btn1, btn2;

    public Color() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);

        setLayout(new BorderLayout(30, 20));
        btn1 = new JButton("Change Color");
        btn2 = new JButton("Change Shape");

        add(btn1, "North");
        add(btn2, BorderLayout.SOUTH);
        setVisible(true);
    }

    public void decorate() {
        Container pane = getContentPane();
        MyDrawPanel md = new MyDrawPanel();

        pane.add(md);
        makeButtonAndEventHandle();
    }

    public void makeButtonAndEventHandle() {
        btn1.addActionListener(this);
        btn2.addActionListener(this);
    }

//    public void changeShape() {}

    public void changeColor(Graphics g) {
        g.setColor(java.awt.Color.red);
        g.fillRect(20, 50, 100, 100);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String strCmd = e.getActionCommand();

        if (strCmd.equals("Change Color")) {
//            changeColor();
        } else if (strCmd.equals("Change Shape")) {
//            changeShape();
        }
    }

    public static void main(String[] args) {
        Color window = new Color();

        window.decorate();
        window.setVisible(true);
    }
}

