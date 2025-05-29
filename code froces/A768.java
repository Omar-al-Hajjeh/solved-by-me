
import java.util.Arrays;
import java.util.Scanner;
public class A768 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n,count = 0;
        n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i < n;i++){
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        for(int x : arr){
            if(x > arr[0] && x < arr[n-1]){
                count++;
            }
        }
        System.out.println(count);
    }
}
