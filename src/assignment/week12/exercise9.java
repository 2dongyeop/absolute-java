package newCode.major.assignment.week12;

import java.util.HashMap;
import java.util.Scanner;

public class exercise9 {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        String name, phoneNumber;

        hashMap.put("김미현", "010-3675-8754");

        System.out.println("검색할 이름을 적으세요. >> ");
        name = scanner.next();

        System.out.println("입력하신 " + name + "의 전화번호는 " + hashMap.get(name) + "입니다.");
    }
}
