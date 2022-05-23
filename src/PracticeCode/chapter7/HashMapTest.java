package newCode.major.PracticeCode.chapter7;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapTest {
    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<>();

        hm.put("대한민국", "서울");
        hm.put("중국", "북경");
        hm.remove("태국");

        System.out.print("키: " + hm.keySet());
        System.out.println(" 값: " + hm.values());

        Iterator<String> keys = hm.keySet().iterator();
        while(keys.hasNext()) {
            String key = keys.next();
            String value = hm.get(key);
            System.out.println(key + ": " + value);
        }
    }
}
