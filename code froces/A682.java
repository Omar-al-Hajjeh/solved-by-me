import java.util.Scanner;

public class A682 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long x,y,a,b,n,m,r,count = 0;
        n = scanner.nextLong();
        m = scanner.nextLong();
        a = n / 5;
        b = m / 5;
        r = a * b * 5;
        x = n % 5;
        y = m % 5;
        r += (x * b);
        r += (y * a);
        for(int i = 1;x >= i;i++){
            for(int j = 1;y >= j;j++){
                if ((i + j) % 5 == 0) {
                    count++;
                    
                }
            }
        }
        r += count;
        System.out.println(r);
    }
}
