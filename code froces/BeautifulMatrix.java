import java.util.Scanner;

public class BeautifulMatrix {
    public static void main(String[] args) {
        int row,column = 1, x = 0;
        Scanner scanner = new Scanner(System.in);
        for (row = 1; row <= 5; row++) {
            for (column = 1; column <= 5; column++) {
                x = scanner.nextInt();
                if (x == 1) break;
            }
            if (x == 1) break;
        }
        int result = Math.abs(row-3) + Math.abs(column -3);
        System.out.println(result);
    }

}
