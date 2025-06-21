import java.util.Scanner;

public class A584 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int t = scanner.nextInt();
        scanner.close();

        
        if (t == 10 && n == 1) {
            System.out.println("-1");
        } else {
            
            if (t == 10) {
                System.out.print("1");
                for (int i = 1; i < n; i++) {
                    System.out.print("0");
                }
                System.out.println();
            } else {
                System.out.print(t);
                for (int i = 1; i < n; i++) {
                    System.out.print("0");
                }
                System.out.println();
            }
        }
    }
}

