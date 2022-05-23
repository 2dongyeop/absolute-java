package newCode.major.PracticeCode.chapter7;

public class WrapperCharacter {
    public static void main(String[] args) {
        Character ch = '@';

        System.out.print(ch + " ");
        System.out.print(ch.charValue() + " ");
        System.out.println(ch.toString());
        System.out.print(ch.compareTo('@') + " ");
        System.out.println(ch.hashCode());
        System.out.println();

        //정적 메소드
        System.out.print(Character.toUpperCase('d')+ " ");
        System.out.println(Character.toLowerCase('F'));
        System.out.print(Character.getName('@') + ", ");
        System.out.println(Character.getName('|') + ", ");
        System.out.print(Character.isDigit('$') + " ");
    }
}
