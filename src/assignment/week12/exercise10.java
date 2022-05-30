package newCode.major.assignment.week12;

import java.util.Scanner;

public class exercise10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MyData md = new MyData("김미현", "010-3675-8754", "SK텔레콤");

        System.out.println("검색할 이름을 적으세요. >> ");
        String name = scanner.next();

        if (name == md.getName().toString()) {
            System.out.println("입력하신 " + name + "의 전화번호는 " + md.getPhoneNum() + "," +
                    "이동 통신사는 " + md.getTelecom() + "입니다.");
        } else {
            System.out.println("해당 이름의 사용자가 없습니다.");
        }
    }
}

class MyData<K, V1, V2> {
    private K name;
    private V1 phoneNum;
    private V2 telecom;

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
