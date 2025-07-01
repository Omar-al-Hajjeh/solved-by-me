import java.util.Locale;
import java.util.Scanner;
public class A270 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        double n,r;
        n = scanner.nextDouble();
        double[] arr = new double[(int) n];
        for(int i = 0;n > i;i++){
            arr[i] = scanner.nextDouble();
        }
        for(double a : arr){
            r = 360 / (180 - a);
            if(r % 1 == 0 && r >= 3){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
