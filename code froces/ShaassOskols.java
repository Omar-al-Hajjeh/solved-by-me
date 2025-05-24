import java.util.Scanner;

public class ShaassOskols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, a, x, y;
        n = scanner.nextInt();
        
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        a = scanner.nextInt();
        for (int i = 0; i < a; i++) {
            x = scanner.nextInt();
            y = scanner.nextInt();
            if(n==1){
                arr[0]=0;
                break;
            }
            if (x == 1) {
                arr[1] += (arr[0] - y);
                arr[0] = 0;
            } else if (x == n) {
                arr[n - 2] += (y - 1);
                arr[n - 1] = 0;
            } else {
                arr[x] += (arr[x - 1] - y);
                arr[x - 2] += (y - 1);
                arr[x - 1] = 0;
            }
        }
        for(int j : arr ){
            System.out.println(j);
        }

    }

}
