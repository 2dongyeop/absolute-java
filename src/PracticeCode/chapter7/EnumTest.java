package newCode.major.PracticeCode.chapter7;

public class EnumTest {
    public enum p1 {c, cpp, java, csharp};

    public static void main(String[] args) {
        p1 clang = p1.c;
        System.out.println(clang);

        clang = p1.csharp;
        switch(clang) {
            case csharp:
                System.out.println(clang + ": C# 언어");
        }

        for(p1 p : p1.values())
            System.out.print(p + " ");
        System.out.println();
    }
}
