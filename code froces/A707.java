import java.util.Scanner;
public class A707 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char c;
        int m,n;
        m = scanner.nextInt();
        n = scanner.nextInt();
        for(int i = 0;n*m > i;i++){
            c = scanner.next().charAt(0);
            if(c == 'M' || c == 'Y' || c == 'C'){
                System.out.println("#Color");
                return;
            }
        }
        System.out.println("#Black&White");
        scanner.close();
    }
}
