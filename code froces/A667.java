import java.util.Scanner;

public class A667 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double d, h, v, e, t, o;
        d = scanner.nextDouble();
        h = scanner.nextDouble();
        v = scanner.nextDouble();
        e = scanner.nextDouble();
        o = (Math.pow((d / 2), 2) * Math.PI) * e;
        if (o > v) {
            System.out.println("NO");
        } else {
            t = ((Math.pow((d / 2), 2) * Math.PI) * h) / (v - o);
            System.out.println("YES\n" + t);
        }
        scanner.close();
    }
}
