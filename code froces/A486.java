import java.util.Scanner;
public class A486 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n;
        n = scanner.nextLong();
        if(n%2 != 0){
            n += 1;
            System.out.println((n / 2)*-1);
            return ;
        } else {
            System.out.println(n / 2);
            return ;
        }
    }
}
