import java.util.Arrays;
import java.util.Scanner;

public class GravityFlip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x;
        int[] arr = new int[n];
        for(int i=0; i < n ; i++){
            x = scanner.nextInt();
            arr[i] = x;
        }
        Arrays.sort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    
}
}