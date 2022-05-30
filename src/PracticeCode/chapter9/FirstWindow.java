package newCode.major.PracticeCode.chapter9;

import javax.swing.JFrame;

public class FirstWindow {
    public static void main(String[] args) {
        //윈도우를 위한 JFrame 객체 생성
        JFrame fw = new JFrame();

        //윈도우 캡션(제목) 지정
        fw.setTitle("첫 윈도!");

        //윈도우의 가로와 세로 지정
        fw.setSize(300, 200);

        //화면에 표시
        fw.setVisible(true);
    }
}
