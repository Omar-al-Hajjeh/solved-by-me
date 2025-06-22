import java.util.Scanner;

public class A381 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), firstcunt = 0, secondcunt = 0;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        int i = 0, j = n - 1,x=0;
        while (i <= j) {
            if (x % 2 == 0) {
                if (arr[i] < arr[j]) {
                    secondcunt += arr[j];
                    j--;
                } else {
                    secondcunt += arr[i];
                    i++;
                }
            } else {
                if (arr[i] < arr[j]) {
                    firstcunt += arr[j];
                    j--;
                } else {
                    firstcunt += arr[i];
                    i++;
                }
            }
x++;
        }
        System.out.println(secondcunt + " " +firstcunt);
        scanner.close();
    }
}