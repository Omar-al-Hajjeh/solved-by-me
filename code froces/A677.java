import java.util.Scanner;

public class A677  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String set = scanner.nextLine();
        int count = 0;
        int[] arr = new int[26];
        for (int i = 0; set.charAt(i) != '}'; i++) {
            if (set.charAt(i) == ',' || set.charAt(i) == ' ' || set.charAt(i) == '{')
                continue;
            arr[set.charAt(i) - 97]++;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 1)
                count++;
        }

        System.out.println(count);
        scanner.close();
    }
}