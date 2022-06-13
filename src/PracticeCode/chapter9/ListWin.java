package newCode.major.PracticeCode.chapter9;

import javax.swing.*;
import java.awt.*;

public class ListWin extends JFrame {
    private static final long serialVersionUID = 1L;

    public ListWin(String title) {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(350, 200);
        setTitle(title);

        makeList();
        setVisible(true);
    }

    public void makeList() {
        String code[] = {"Cupcake 1.5", "Donut 1.6", "Eclair 2.0"};

        JList<String> lst = new JList<>(code);
        JPanel pan1 = new JPanel();
        pan1.add(lst);

        String swing[] = {"javax.swing", "javax.swing.border", "javax.swing.event"};
        JList<String> pkg = new JList<>(swing);
        JScrollPane sp = new JScrollPane(pkg);
        sp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

        String ph[] = {"S", "S2", "S3", "S5"};
        JComboBox<String> cb = new JComboBox<>(ph);
        cb.setEditable(true);
        cb.setSelectedIndex(3);

        JPanel pan2 = new JPanel();
        pan2.add(sp);
        pan2.add(cb);

        JPanel p = new JPanel(new GridLayout(1,2));
        p.add(pan1);
        p.add(pan2);

        add(p);
    }

    public static void main(String[] args) {
        ListWin win = new ListWin("목록 선택을 위한 컨트롤");
    }
}
