import java.util.Scanner;

public class PoliceRecruits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), x, off = 0, action = 0, cunt = 0;
        for (int i = 0; i < n; i++) {
            x = scanner.nextInt();
            if (x == -1) {
                if (off == 0) {
                    cunt++;
                } else {
                    off -= 1;
                }
            }
            else off += x;
        }
        System.out.println(cunt);
        scanner.close();
    }
}
