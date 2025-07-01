import java.util.Scanner;
public class A127 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n,k,d,x1,x2,y1,y2,sum = 0;
        n = scanner.nextDouble();
        k = scanner.nextDouble();
        x1 =scanner.nextDouble();
        y1 =scanner.nextDouble();
        for(int i = 0;n - 1 > i;i++){
            x2 = scanner.nextDouble();
            y2 = scanner.nextDouble();
            d = Math.sqrt(Math.pow((y1 - y2),2) + Math.pow((x1 - x2),2));
            x1 = x2;
            y1 = y2;
            sum += d;
        }
        sum /= 50;
        sum *= k;
        System.out.println(sum);
    }
}
