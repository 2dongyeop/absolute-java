package newCode.major.PracticeCode.chapter10;


import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

//프레임 만들기 -> 위젯 만들기 -> 액션 이벤트 처리하기 위한 액션 리스너 implement -> 추상메소드 ActionPerformed() 처리
public class MouseEventWin extends JFrame {
    private static final long serialVersionUID = 1L;
    MouseEventWin childWin = null;
    static int countChild;

    public MouseEventWin() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 150);
        setVisible(true);

        addMouseListener(new MyMouseListener());
    }

    class MyMouseListener implements MouseListener {
        @Override
        public void mousePressed(MouseEvent e) {
            Rectangle bounds = getBounds();
            int x = e.getX() + bounds.x;
            int y = e.getY() + bounds.y;

            if (childWin == null) {
                childWin = new MouseEventWin();
            }
            childWin.setLocation(x, y);
            childWin.setTitle(++countChild + "번째 자식 윈도우");
            childWin.setSize(getSize().width*2/3, getSize().height*2/3);
            childWin.setVisible(true);
        }

        @Override
        public void mouseClicked(MouseEvent e) {

        }

        @Override
        public void mouseReleased(MouseEvent e) {
            if (childWin != null) childWin.setVisible(false);
        }

        @Override
        public void mouseEntered(MouseEvent e) {

        }

        @Override
        public void mouseExited(MouseEvent e) {

        }
    }

    public static void main(String[] args) {
        MouseEventWin myWin = new MouseEventWin();
        myWin.setTitle("마우스를 누르세요");
    }
}
