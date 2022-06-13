package newCode.major.PracticeCode.chapter9;

import javax.swing.*;
import java.awt.*;

class MyDrawPanel extends JPanel {
    @Override
    public void paintComponent(Graphics g) {
        g.setColor(Color.orange);
        g.fillRect(20, 50, 100, 100);
    }
}

//public class GUITest1 {} 으로 할거면 import javax.swing.JFrame 하기
public class GUITest1 extends JFrame {
    public static void main(String[] args) {
        GUITest1 myGUI = new GUITest1();
        myGUI.setTitle("첫 윈도우");
        myGUI.setSize(300, 300);

        Container pane = myGUI.getContentPane();
        MyDrawPanel md = new MyDrawPanel();

        pane.add(md);
        myGUI.setVisible(true);
    }
}
