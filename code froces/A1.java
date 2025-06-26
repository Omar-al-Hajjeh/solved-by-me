import java.util.Scanner;
public class A1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n,m,a,x,y;
        n = scanner.nextDouble();
        m = scanner.nextDouble();
        a = scanner.nextDouble();
        x = Math.ceil(n / a);
        y = Math.ceil(m / a);
        System.out.println((long) (x * y));
        scanner.close();

    }
}
