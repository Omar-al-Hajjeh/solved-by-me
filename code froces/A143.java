import java.util.Scanner;

public class A143 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int r1 = scanner.nextInt();
        int r2 = scanner.nextInt();
        int c1 = scanner.nextInt();
        int c2 = scanner.nextInt();
        int d1 = scanner.nextInt();
        int d2 = scanner.nextInt();

        
        for (int a = 1; a <= 9; a++) {
            for (int b = 1; b <= 9; b++) {
                for (int c = 1; c <= 9; c++) {
                    for (int d = 1; d <= 9; d++) {

                        
                        if (a != b && a != c && a != d &&
                            b != c && b != d &&
                            c != d) {

                            
                            if (a + b == r1 &&
                                c + d == r2 &&
                                a + c == c1 &&
                                b + d == c2 &&
                                a + d == d1 &&
                                b + c == d2) {

                                System.out.println(a + " " + b);
                                System.out.println(c + " " + d);
                                return;
                            }
                        }
                    }
                }
            }
        }

        System.out.println(-1);
    }
}

