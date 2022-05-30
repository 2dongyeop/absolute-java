package newCode.major.PracticeCode.chapter8;

class MyThread extends Thread {
    public void run() {
        for (int i = 1; i < 10; i++) {
            System.out.println(getName() + ": " + i);
        }
    }
}

public class SimpleThread {
    public static void main(String[] args) {
        MyThread th = new MyThread();
        th.start();
    }
}
