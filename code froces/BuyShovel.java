import java.util.Scanner;

public class BuyShovel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k, r, i;
        k = scanner.nextInt();
        r = scanner.nextInt();
        for (i = 1; i <= 9; i++) {
            if ((k * i) % 10 == r || (k * i) % 10 == 0) {
                break;
            }
        }
        System.out.println(i);

    }
}