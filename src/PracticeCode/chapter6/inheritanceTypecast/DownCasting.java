package newCode.major.PracticeCode.chapter6.inheritanceTypecast;

public class DownCasting {
    public static void main(String[] args) {
        Person she = new Person("이소라", 2056432);
        System.out.println(she.getName() + " " + she.getNumber());
        //Faculty f = she; //컴파일 오류 -> 다운 캐스팅인데 명시적 형변환이 안되어있음
        //Faculty f1 = (Faculty) she; //실행 오류 -> Faculty 객체가 she에 할당되지 않았음

        Person p = new Staff("김상기", 1187543, "강서대학교", 3456);
        //Staff s = p; //컴파일 오류 -> 다운 캐스팅인데 명시적 형변환이 안되어있음
        Staff s = (Staff) p;
        s.setDivision("교학처");
        System.out.print(p.getName() + " " + p.getNumber() + " ");
        System.out.print(s.getUniv() + " " + s.getIdNumber() + " ");
        System.out.println(s.getDivision());
    }
}

