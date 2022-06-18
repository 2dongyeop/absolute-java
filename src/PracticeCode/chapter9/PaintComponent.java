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
    public static void main(String[] args) {
        PaintComponent pc = new PaintComponent();
        pc.setTitle("첫 윈도우");
        pc.setSize(300, 300);

        Container pane = pc.getContentPane();
        MyDraw md = new MyDraw();
        pane.add(md);
        pc.setVisible(true);
    }
}
