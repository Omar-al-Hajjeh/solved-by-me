
import java.util.Scanner;

public class A136 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == arr[j]) {
                    System.out.print( j + 1 + " ");
                }
            }

        }
        scanner.close();
    }
}