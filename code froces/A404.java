import java.util.Scanner;

public class A404 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] grid = new String[n];

        for (int i = 0; i < n; i++) {
            grid[i] = scanner.next();
        }

        char in = grid[0].charAt(0);      
        char out = grid[0].charAt(1);     

        if (in == out) {
            System.out.println("NO");
            return;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                char current = grid[i].charAt(j);
                if (i == j || i + j == n - 1) {
                    if (current != in) {
                        System.out.println("NO");
                        return;
                    }
                } else {
                    if (current != out) {
                        System.out.println("NO");
                        return;
                    }
                }
            }
        }
            scanner.close();
        System.out.println("YES");
        
    }
}
