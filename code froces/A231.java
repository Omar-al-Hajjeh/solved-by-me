import java.util.Scanner;
public class A231 {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int cunt =0;
    for(int i = 0; i < n ; i++){
        
        int p = scanner.nextInt();
        int v =scanner.nextInt();
        int t =scanner.nextInt();
        if(p+v+t >= 2){
            cunt++;

        }
    }
    System.out.println(cunt);
}
}