import java.util.Scanner;

public class A766 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a, b;
        a = scanner.next();
        b = scanner.next();
        if (a.equals(b)) {
            System.out.println(-1);
        } else {
            System.out.println(Math.max(a.length(), b.length()));
        }
        scanner.close();
    }
}
