import java.util.Scanner;

public class A59 {
    public static void main(String[] args) {
        int upperCunt = 0, lowerCunt = 0;
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) >= 65 && string.charAt(i) <= 90) {
                upperCunt++;
            }
            if (string.charAt(i) >= 97 && string.charAt(i) <= 122) {
                lowerCunt++;
            }
        }
        if (upperCunt <= lowerCunt)
            System.out.println(string.toLowerCase());
        else {
            System.out.println(string.toUpperCase());
        }
        scanner.close();
    }
}