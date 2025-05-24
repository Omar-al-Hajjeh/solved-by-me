import java.util.Scanner;

public class CarrotCakes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, t, k, d, cunt1 = 0, cunt2 = 0;
        n = scanner.nextInt();
        t = scanner.nextInt();
        k = scanner.nextInt();
        d = scanner.nextInt();
        cunt1 = ((n + k - 1) / k) * t;
        cunt2 = (((n + (2 * k) - 1) / (k * 2)) * t) + ;
        if (cunt1 > cunt2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
