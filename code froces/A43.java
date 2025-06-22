import java.util.Scanner;
public class A43 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n,count = 0;
        n = scanner.nextInt();
        String b,a,x = "";
        a = scanner.next();
        count++;
        for(int i = 0;i < n - 1;i++){
            b = scanner.next();
            if(a.equals(b)){
                count++;
            } else {
                count--;
                x = b;
            }
        }
        if(count < 0){
            System.out.println(x);
        }
        if(count > 0){
            System.out.println(a);
        }
        
        scanner.close();
    }
}
