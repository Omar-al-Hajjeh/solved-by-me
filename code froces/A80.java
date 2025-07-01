import java.util.Scanner;

public class A80 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, m, f = 0, t = 0;
        n = scanner.nextInt();
        m = scanner.nextInt();
        for (int i = n + 1; i <= m; i++) {
            for (int j = 2; j <= Math.floor(Math.sqrt(m)); j++) {
                if (i % j == 0) {
                    f = 1;
                    break;
                }
            }
            if (f == 0) {
                t = i;
                break;
            }
            f = 0;
        }
        if (t == m) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        scanner.close();
    }
}
