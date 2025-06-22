import java.util.Scanner;
public class A709 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int d, b, n, x, w = 0, cunt = 0;
        n = scanner.nextInt();
        b = scanner.nextInt();
        d = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            x = scanner.nextInt();
            if (x <= b) {
                w += x;
            }
            if (w > d) {
                cunt++;
                w = 0;
                
            }
        }
        System.out.println(cunt);
        scanner.close();
    }
}
