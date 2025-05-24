import java.util.Scanner;
public class DieRoll {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int y,w,b=6,a;
        y = scanner.nextInt();
        w = scanner.nextInt();
        a = (6 - Math.max(y,w)) + 1;
        if(a == 1){a=1;b=6;}
        if(a == 2){a=1;b=3;}
        if(a == 3){a=1;b=2;}
        if(a == 4){a=2;b=3;}
        if(a == 5){a=5;b=6;}
        if(a == 6){a=1;b=1;}
        System.out.println(a + "/" + b);
    }
    
    }

    

