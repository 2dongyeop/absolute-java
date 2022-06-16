package newCode.major.PracticeCode.chapter6.inheritanceTypecast;

public class UpCasting {
    public static void main(String[] args) {
        Person she = new Person("이소라", 2056432);
        System.out.println(she.getName() + " " + she.getNumber());

        Faculty f = new Faculty("김영태", 1145782, "연한대학교", 38764);
        Person p = f;  //업캐스팅
        System.out.print(p.getName() + " " + p.getNumber() + " ");
        //System.out.println(p.getUniv()); //참조 불가
        System.out.println(f.getName() + " " + ((Person) f).getNumber());
        System.out.println(f.getUniv() + " " + f.getIdNumber());

        Staff s = new Staff("김상기", 1187543, "강서대학교", 3456);
        s.setDivision("교학처");

        Person pn = s; //업캐스팅
        Faculty ft = s; //업캐스팅
        System.out.print(pn.getName() + " " + pn.getNumber() + " ");
        System.out.print(ft.getUniv() + " " + ft.getIdNumber() + " ");
        System.out.println(s.getDivision());
    }
}

class Person {
    private String name;
    private long number;

    Person(String name, long number) {
        super(); //생략 가능
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public long getNumber() {
        return number;
    }
}

class Faculty extends Person {
    private String univ;
    private long idNumber;

    Faculty(String name, long number, String univ, long idNumber) {
        super(name, number);
        this.univ = univ;
        this.idNumber = idNumber;
    }

    public long getSNumber() {
        return super.getNumber();
    }

    public String getUniv() {
        return univ;
    }

    public long getIdNumber() {
        return idNumber;
    }
}

class Staff extends Faculty {
    private String division;

    Staff(String name, long number, String univ, long idNumber) {
        super(name, number, univ, idNumber);
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public String getDivision() {
        return division;
    }
}

