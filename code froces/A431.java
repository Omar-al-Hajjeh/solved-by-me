import java.util.Scanner;

public class A431{
    public static void main(String[] args) {
        int cunt = 0;
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 1; i < 5; i++) {
            arr[i] = scanner.nextInt();
        }
        String numbers = scanner.next();
        for (int i = 0; numbers.length() > i; i++) {
            cunt += arr[numbers.charAt(i) - 48];
        }
        System.out.println(cunt);

    }

}