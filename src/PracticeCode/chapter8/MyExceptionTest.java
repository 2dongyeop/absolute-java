package newCode.major.PracticeCode.chapter8;

class MyException extends Exception {
    public MyException(String msg) {
        super(msg);
    }
}

public class MyExceptionTest {
    public static void main(String[] args) {
        try {
            doException(true);
        } catch (MyException e) {
            System.out.println("e: " + e);
            System.out.println("e.getMessage(): " + e.getMessage());
        }
    }

    public static void doException(boolean bool) throws MyException {
        if(bool)
            throw new MyException("내가 만든 예외");
    }
}
