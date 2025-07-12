import java.util.Scanner;

public class A365 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, y, x, outcount = 0, incount = 0;
        String s;
        n = scanner.nextInt();
        y = scanner.nextInt();
        for (int i = 0; n > i; i++) {
            x = scanner.nextInt();
            s = String.valueOf(x);
            for (int j = 0; y >= j; j++) {
                if (s.contains(String.valueOf(j))) {
                    incount++;
                }
            }
            if (incount == y + 1) {
                outcount++;
            }
            incount = 0;
        }
        System.out.println(outcount);
        scanner.close();
    }
}
