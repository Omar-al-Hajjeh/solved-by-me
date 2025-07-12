import java.util.Scanner;

public class A225 {
    public static boolean test(int x, int y, int z) {
        int count = 0;
        if (x == y) {
            count++;
        }
        if (x == (7 - y)) {
            count++;
        }
        if (x == z) {
            count++;
        }
        if (x == (7 - z)) {
            count++;
        }
        
        return count == 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n,x;
        n = scanner.nextInt();
        x = scanner.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        for (int i = 0; n > i; i++) {
            arr1[i] = scanner.nextInt();
            arr2[i] = scanner.nextInt();
        }
        for (int i = 0; n - 1 > i; i++) {
            if ((A225.test(arr1[i], arr1[i + 1], arr2[i + 1])) && (A225.test(arr2[i], arr1[i + 1], arr2[i + 1]))) {
                continue;
            } else {
                System.out.println("NO");
                return;
            }

        }
        System.out.println("YES");
    }
}
