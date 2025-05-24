import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class HelpfulMaths {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        String s;
        s = scanner.next();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '+')
                continue;
            else {
                arr.add(s.charAt(i) - '0');
            }
        }
        
        Collections.sort(arr);
        for (int i = 0; i < arr.size(); i++) {
            if (i == arr.size() - 1)
                System.out.print(arr.get(i));
            else
                System.out.print(arr.get(i) + "+");

        }

    }
}
