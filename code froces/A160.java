import java.util.Arrays;
import java.util.Scanner;

public class A160 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, sum2 = 0, sum1 = 0, count = 0;
        n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; n > i; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int i : arr) {
            sum1 += i;
        }
        Arrays.sort(arr);
        for (int i = n - 1; 0 <= i; i--) {
            if (sum1 < sum2)
                break;
            sum1 -= arr[i];
            sum2 += arr[i];
            count++;

        }
        scanner.close();
        System.out.println(count);
    }
}
