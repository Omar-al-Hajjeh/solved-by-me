import java.util.Scanner;

public class PetyaAndStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String first = scanner.nextLine();
        String second = scanner.nextLine();
        first = first.toLowerCase();
        second = second.toLowerCase();

        for (int i = 0; i < first.length(); i++) {
            if (first.charAt(i) < second.charAt(i)) {
                System.out.println("-1");
                return;
            }
            if (first.charAt(i) > second.charAt(i)) {
                System.out.println("1");
                return;
            }
        }
        System.out.println("0");
        scanner.close();
    }

}
