import java.util.Scanner;

public class A236 {
    public static void main(String[] args) {
        int cunt = 0;
        int[] latters = new int[26];
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
        for (int i = 0; i < string.length(); i++) {
            latters[string.charAt(i) - 'a']++;

        }
        for (int i = 0; i < latters.length; i++) {
            if (latters[i] > 0) {
                cunt++;
            }
        }
        if (cunt % 2 != 0) {
            System.out.println("IGNORE HIM!");
        } else {
            System.out.println("CHAT WITH HER!");
        }
        scanner.close();
    }
}
