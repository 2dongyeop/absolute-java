package newCode.major.PracticeCode.chapter7;

public class ObjectMath {
    public static void main(String[] args) {
        Object object = new Object();
        System.out.println(object.getClass());
        System.out.println(object.hashCode());
        System.out.println(object.toString());

        System.out.println(Math.PI);
        System.out.println(Math.round((-3.5)));
        System.out.println(Math.abs(-3.4)); //절대값
        System.out.println(Math.pow(3, 4)); //3^4
    }
}
