import java.util.Scanner;

public class A807 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a, b;
        int prev = -1; 
        boolean isRated = false;
        boolean isUnrated = false;

        for (int i = 0; i < n; i++) {
            a = scanner.nextInt();
            b = scanner.nextInt();

            if (a != b) {
                isRated = true;
                break; 
            }

            if (i > 0 && a > prev) {
                isUnrated = true;
            }

            prev = a; 
        }

        if (isRated) {
            System.out.println("rated");
        } else if (isUnrated) {
            System.out.println("unrated");
        } else {
            System.out.println("maybe");
        }

        scanner.close();
    }
}
