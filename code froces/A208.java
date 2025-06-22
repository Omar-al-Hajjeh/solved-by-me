import java.util.Scanner;
public class A208 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s;
        s = scanner.next();
        String[] parts = s.split("WUB");
        for(String i : parts){
            System.out.print(i + " ");
        }
        
        scanner.close();
        }
    }

