package newCode.major.PracticeCode.chapter7;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {
    public static void main(String[] args) {
        HashSet<Integer> setA = new HashSet<Integer>();

        setA.add(3); setA.add(5); setA.add(7);
        setA.add(8); setA.add(7); setA.add(9);
        System.out.print("A = ");
        print(setA);
        System.out.println("  A = " + setA);
    }
    public static void print(HashSet<Integer> s) {
        Iterator<Integer> i = s.iterator();
        while(i.hasNext())
            System.out.print(i.next() + " ");
    }
}
