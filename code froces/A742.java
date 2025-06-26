import java.util.Scanner;
public class A742 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        n = scanner.nextInt();
        if(n == 0){
            System.out.println("1");
            return;
        }
        if(n % 4 == 0){
            System.out.println("6");
            return;
        }
        if(n % 4 == 1){
            System.out.println("8");
            return;
        }
        if(n % 4 == 2){
            System.out.println("4");
            return;
        }
        if(n % 4 == 3){
            System.out.println("2");
            return;
        }
    }
}
