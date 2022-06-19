package newCode.major.PracticeCode.chapter6;

public class Fruit {
    public static void main(String[] args) {
        Fruit f = new Fruit();
        System.out.println(f instanceof Fruit);
        System.out.println(f instanceof Apple);
        System.out.println(f instanceof Grape);

        Fruit fa = new Apple();
        System.out.println(f instanceof Fruit);
        System.out.println(f instanceof Apple);
        System.out.println(f instanceof Pear);

        Apple a = new Apple();
        System.out.println(a instanceof Fruit);
        System.out.println(a instanceof Apple);
    }
}

class Apple extends Fruit {}

class Pear extends Fruit {}

class Grape extends Fruit {}
