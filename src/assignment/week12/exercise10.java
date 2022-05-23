package newCode.major.assignment.week12;

import java.util.Scanner;

public class exercise10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MyData md = new MyData("김미현", "010-3675-8754", "SK텔레콤");
        String name;

        System.out.println("검색할 이름을 적으세요. >> ");
        name = scanner.next();

        System.out.println("입력하신 " + name + "의 전화번호는 " + md.getPhoneNum() + "," +
                "이동 통신사는 " + md.getTelecom() + "입니다.");
    }
}

class MyData<K, V1, V2> {
    K name;
    V1 phoneNum;
    V2 telecom;

    MyData(K name, V1 phoneNum, V2 telecom) {
        this.name = name;
        this.phoneNum = phoneNum;
        this.telecom = telecom;
    }

    public K getName() {
        return name;
    }
    public V1 getPhoneNum() {
        return phoneNum;
    }
    public V2 getTelecom() {
        return telecom;
    }
}
