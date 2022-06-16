package newCode.major.PracticeCode.chapter6.inheritanceOverriding;

public class MyMath {
    double x, y;

    public MyMath(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double multuply() {
        return x * y;
    }

    public static double multiply(double a, double b)  {
        return a * b;
    }

    public static void main(String[] args) {
        MyMath math = new MyMath(3.4, 6.7);
        System.out.println(math.multuply());
        System.out.println(MyMath.multiply(3.4, 6.7));
    }
}
