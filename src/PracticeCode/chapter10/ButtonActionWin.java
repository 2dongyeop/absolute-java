package newCode.major.PracticeCode.chapter10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonActionWin extends JFrame implements ActionListener {
    private static final long serialVersionUID = 1L;

    JButton btnOk = new JButton("OK");
    JButton btnCancel = new JButton("Cancel");
    JLabel dlb = new JLabel("클릭한 버튼의 제목이 보입니다.");

    public ButtonActionWin() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 130);
        makeButtonAndEventHandle();
        setVisible(true);
    }

    public void makeButtonAndEventHandle() {
        JPanel p = new JPanel(new GridLayout(0, 2));
        p.add(btnOk);
        p.add(btnCancel);
        add(p, BorderLayout.CENTER);
        add(dlb, BorderLayout.SOUTH);

        btnOk.addActionListener(this);
        btnCancel.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent evt) {
        String strCmd = evt.getActionCommand();

        if (strCmd.equals("OK")) {
            dlb.setText(" OK Button");
        } else if (strCmd.equals("Cancel")) {
            dlb.setText(" Cancel Button");
        }
    }

    public static void main(String[] args) {
        ButtonActionWin myWin = new ButtonActionWin();
        myWin.setTitle("버튼 액션 이벤트 처리");
    }
}