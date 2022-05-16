package newCode.major.assignment.week11;

import newCode.major.assignment.week9.Player;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GuessGame {
    int SIZE = 3;
    List<Integer> answerNum = new ArrayList<>(3);

    boolean run = true;
    Scanner scanner = new Scanner(System.in);

    newCode.major.assignment.week9.Player p1 = new newCode.major.assignment.week9.Player();
    newCode.major.assignment.week9.Player p2 = new newCode.major.assignment.week9.Player();
    newCode.major.assignment.week9.Player p3 = new Player();

    public void startGame() {
        int answerCount = 0;
        for (int i = 0; i < SIZE; i++) {
            int ranNum = (int)(Math.random()*10 + 1); //1부터 10까지의 수를 포장
            answerNum.add(ranNum);
        }
        System.out.println("=====게임 시작=====");

        loop : do {
            System.out.println("=====1번째 플레이어=====");
            loop1 : for (int i = 0; i < SIZE; i++) {
                if (answerNum.get(i) == p1.guess()) {
                    System.out.println("정답입니다.");
                    answerCount++;

                    if (answerCount == 3) {
                        System.out.println("우승자가 나왔습니다.");
                        break loop;
                    }
                } else {
                    System.out.println("오답입니다.");
                    answerCount = 0;
                    break loop1;
                }
            }
            System.out.println("=====2번째 플레이어=====");
            loop2 : for (int i = 0; i < SIZE; i++) {
                if (answerNum.get(i) == p2.guess()) {
                    System.out.println("정답입니다.");
                    answerCount++;

                    if (answerCount == 3) {
                        System.out.println("우승자가 나왔습니다.");
                        break loop;
                    }
                } else {
                    System.out.println("오답입니다.");
                    answerCount = 0;
                    break loop2;
                }
            }
            System.out.println("=====3번째 플레이어=====");
            loop3 : for (int i = 0; i < SIZE; i++) {
                if (answerNum.get(i) == p3.guess()) {
                    System.out.println("정답입니다.");
                    answerCount++;

                    if (answerCount == 3) {
                        System.out.println("우승자가 나왔습니다.");
                        break loop;
                    }
                } else {
                    System.out.println("오답입니다.");
                    answerCount = 0;
                    break loop3;
                }
            }
        } while(run);
    }
}

