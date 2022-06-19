package newCode.major.PracticeCode.finalTest;

import java.util.Random;

class BankAccount {
    int balance = 0;
    int diff = 0;

    synchronized void withdraw(int money) {
        if (money > 0 && balance >= money) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.err.println(e);
            }
            balance -= money;
            System.out.println(money + " 인출하여 현재잔고 " + balance + "입니다. ");
        } else if (balance < money) {
            System.out.println("잔고가 부족하여 인출할 수 없습니다.");
        }
    }

    void deposit(int money) {
        synchronized(this) {
            if (money > 0) {
                balance += money;
                System.out.println(money + " 입금하여 현재잔고 " + balance + "입니다. ");
            }
        }
    }
}

public class SyncTest implements Runnable {
    BankAccount bankAccount = new BankAccount();
    @Override
    public void run() {
        int amount = new Random().nextInt(10000);
        amount = amount % 10 * 1000;
        System.out.println(Thread.currentThread().getName() + " 금액 : " + amount);
        bankAccount.deposit(amount);
        bankAccount.withdraw(amount * 2);

        if (bankAccount.balance < 0) {
            System.out.println(Thread.currentThread().getName() + " 잔고 : " + bankAccount.balance + " => 오류 종료");
            return;
        }
    }

    public static void main(String[] args) {
        Runnable r = new ThreadState();
        new Thread(r).start();
        new Thread(r).start();
    }
}
