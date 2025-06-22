import java.util.Arrays;
import java.util.Scanner;

public class A228 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[4];
        int x, cunt = 0;
        Arrays.sort(arr);
        for (int i = 0; i < 4; i++) {
            x = scanner.nextInt();
            arr[i] = x;
        }
        Arrays.sort(arr);
        for (int i = 0; i < 3; i++) {
            if (arr[i] == arr[i + 1])
                cunt++;
        }
        System.out.println(cunt);
        scanner.close();
    }
}
