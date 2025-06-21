import java.util.Scanner;

public class A474 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n, k, r = 0;
        n = scanner.nextLong();
        k = scanner.nextLong();
        if (n % 2 == 0) {
            if (k <= n / 2) {
                r = k + (k - 1);
            } else {
                r = (k + (k - 1)) - (n - 1);
            }
        } else {
            if (k <= (n + 1) / 2) {
                r = k + (k - 1);
            } else {
                r = (k + (k - 1)) - n;
            }
        }
        System.out.println(r);
        scanner.close();
    }
}