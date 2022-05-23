package newCode.major.PracticeCode.chapter8;

public class ExceptionHandling {
    static int num[];

    public static void main(String[] args) {
        String str[] = {"안녕하세요!", "Hello"};

        try {
            System.out.println(str[0]);
            System.out.println(num.length); //여기서 예외 발생
            System.out.println(str[2]); //얘도 오류인데 위 문장에서 예외가 발생하여 실행되지 않음
        } catch(Exception e) {
            System.out.println("예외 발생: " + e);
        } finally {
            System.out.println("try 실행");
        }

        System.out.println("프로그램이 정상적으로 종료됩니다.");
    }
}
