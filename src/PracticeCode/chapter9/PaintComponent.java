package newCode.major.PracticeCode.chapter9;

import javax.swing.*;
import java.awt.*;

class MyDraw extends JPanel {
    @Override
    public void paintComponent(Graphics g) {
        g.setColor(Color.orange);
        g.fillRect(20, 50, 100, 100);
    }
}

public class PaintComponent extends JFrame {
    public PaintComponent(String title) {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle(title);
        setSize(300, 300);

        Container pane = getContentPane();
        MyDraw md = new MyDraw();
        pane.add(md);
        setVisible(true);
    }

    public static void main(String[] args) {
        PaintComponent pc = new PaintComponent("첫 윈도우");
    }
}
