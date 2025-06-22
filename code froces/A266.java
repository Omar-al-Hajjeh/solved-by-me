import java.util.Scanner;

public class A266 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), cunt = 0;
        String stones = scanner.next();
        for (int i = 0; i < n - 1; i++) {
            if (stones.charAt(i) == stones.charAt(i + 1)) cunt++;
        }
        System.out.println(cunt);
    }
}
