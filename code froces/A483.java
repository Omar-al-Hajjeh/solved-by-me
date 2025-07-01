import java.util.Scanner;

public class A483 {
    public static long gcd(long a, long b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
        
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long l = scanner.nextLong();
        long r = scanner.nextLong();
        long a = l;

        for (a = l; a <= r - 2; a++) {
            long b = a + 1;
            long c = a + 2;
            if (c > r) break;

            if (gcd(a, b) == 1 && gcd(b, c) == 1 && gcd(a, c) != 1) {
                System.out.println(a + " " + b + " " + c);
                return;
            }
        }

        System.out.println(-1);
    }
}
