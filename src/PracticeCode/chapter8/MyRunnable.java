package newCode.major.PracticeCode.chapter8;

public class MyRunnable implements Runnable {
    public void run() {
        go();
    }
    public void go() {
        doMore();
    }
    public void doMore() {
        System.out.println("top on the stack");
    }
}

class ThreadTester {
    public static void main(String[] args) {
        Runnable threadjob = new MyRunnable();
        Thread myThread = new Thread(threadjob);
        myThread.start();
        System.out.println("back in the main");
        //이렇게 하면 어떨땐는 메인스레드의 back in the main이,
        //어떨 때는 보조스레드의 top on the stack이 먼저 실행
        //이것은 스케줄링의 불확실성..?
    }
}
