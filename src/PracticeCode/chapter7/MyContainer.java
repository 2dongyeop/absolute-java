package newCode.major.PracticeCode.chapter7;

import java.util.ArrayList;

public class MyContainer<E> {
    private ArrayList<E> list;

    public MyContainer() {
        list = new ArrayList<E>();
    }

    public E get(int index) {
        return list.get(index);
    }

    public void add(E element) {
        list.add(element);
    }

    public static void main(String[] args) {
        MyContainer<String> pl = new MyContainer<>();
        pl.add("algol");
        pl.add("C");
        //pl.add(5); -> 오류 발생 : 타입 다름
        System.out.println(pl.get(0));
        System.out.println(pl.get(1));
    }
}
