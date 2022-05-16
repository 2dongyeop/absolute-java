package newCode.major.Dictionary;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class DictionaryLauncher {
    static List<Word> wrdNote = new ArrayList<>();

    static void start() {
        System.out.println("1.자료 추가 | 2.자료 삭제 | 3.자료 조회 | 4.자료 검색");
        Scanner scanner = new Scanner(System.in);
        int menu = scanner.nextInt();

        String input;
        switch (menu) {
            case 1:
                input = inputString();
                InsertDictionary.insert(input);
                break;
            case 2:
                input = inputString();
                DeleteDictionary.delete(input);
                break;
            case 3:
                PrintDictionary.printList();
                break;
            case 4:
                input = inputString();
                SearchDictionary.search(input);
                break;
            default:
                System.err.println("1 ~ 4 사이의 값을 입력해주세요.");
                break;
        }
    }
    static String inputString() {
        System.out.print("단어를 입력해주세요 : ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        return input;
    }
}
