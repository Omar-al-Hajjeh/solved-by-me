import java.util.Scanner;
public class ColorfulStones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cunt = 1,j = 0;
        String s,t;
        s = scanner.next();
        t = scanner.next();
        for(int i=0; i < t.length() ;i++){
            if(t.charAt(i) == s.charAt(j)) {cunt++; j++;}
        }
        System.out.println(cunt);

    }
}
