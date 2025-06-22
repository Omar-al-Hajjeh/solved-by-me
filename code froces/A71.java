import java.util.Scanner;
public class A71{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        String s;
        n = scanner.nextInt();
        for(int i=0; i < n ;i++){
            s = scanner.next();
            if(s.length() <= 10) System.out.println(s);
            else{
                System.out.println (String.valueOf(s.charAt(0)) + String.valueOf(s.length() - 2) + String.valueOf(s.charAt(s.length() - 1)));
            }
        }
    }
}
