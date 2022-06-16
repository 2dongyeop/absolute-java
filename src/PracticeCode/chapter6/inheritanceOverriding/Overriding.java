package newCode.major.PracticeCode.chapter6.inheritanceOverriding;

public class Overriding {
    public static void main(String[] args) {
        Person she = new Person("이소라", 2056432);
        she.printInfo();

        Person i = new Faculty("김영태", 1145782, "연한대학교", 38764);
        i.printInfo();

        Person he = new Staff("최영기", 1167429, "남도대학교", 1287);
        he.printInfo();
        Faculty f = (Faculty) he;
        f.printInfo();
        Staff s = (Staff) he;
        s.printInfo();
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

    public void printInfo() {
        System.out.println("이름: " + name + " 주민번호: " +number);
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

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("대학: " + univ + " 직원번호: " + idNumber);
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

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("부서: " + division);
    }

    public void printFacultyInfo() {
        super.printInfo();
    }
}


