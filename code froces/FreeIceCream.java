import java.util.Scanner;

public class FreeIceCream {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long x;
        int n,y,count = 0;
        char m;
        n = scanner.nextInt();
        x = scanner.nextLong();
        for (int i = 0; n > i; i++) {
            m = scanner.next().charAt(0);
            y = scanner.nextInt();
            if (m == '-') {
                if (y > x) {
                    count++;
                } else {
                    x -= y;
                }
            } else if (m == '+') {
                x += y;
            }

        }
        System.out.println(x + " " + count);
    }
}