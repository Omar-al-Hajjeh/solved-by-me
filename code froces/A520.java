import java.util.Scanner;

public class A520 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, count = 0;
        String s;
        n = scanner.nextInt();
        s = scanner.next();
        int[] arr = new int[n];
        if (n < 26)
            System.out.println("NO");
        else {
            s = s.toLowerCase();
            for (int i = 0;s.length() > i; i++) {
                arr[s.charAt(i) - 'a']++;
            }
            for (int i = 0;s.length() > i; i++) {
                if (arr[i] != 0)
                    count++;
            }
            if (count == 26)
                System.out.println("YES");
                else{
                    System.out.println("NO");
                }
        }
        scanner.close();
    }

}