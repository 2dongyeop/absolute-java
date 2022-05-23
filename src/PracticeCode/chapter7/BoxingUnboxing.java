package newCode.major.PracticeCode.chapter7;

public class BoxingUnboxing {
    public static void main(String[] args) {
        Double radius = 2.59; //Boxing

        double r = radius; //Unboxing
        System.out.print("반지름: " + r + ", 원 면적: ");
        System.out.println(radius*radius*Math.PI);

        Integer x = 5, y = 3; //boxing
        System.out.printf("%d + %d = %d %n", x, y, x+y); //unboxing
        boolean b = true; //boxing
        System.out.printf("%b %n", b); //unboxing
    }
}
