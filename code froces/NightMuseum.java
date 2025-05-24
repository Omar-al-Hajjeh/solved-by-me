import java.util.Scanner;

public class NightMuseum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = 0, y = 0, cunt = 0;
        String name = scanner.next();
        x = name.charAt(0) - 'a';
        y = 26 - x;
        if (x <= y)
            cunt += x;
        else
            cunt += y;
        for (int i = 1; i < name.length(); i++) {
            x = Math.abs(name.charAt(i) - name.charAt(i - 1));
            y = 26 - x;
            if (x <= y)
                cunt += x;
            else
                cunt += y;
        }
        System.out.println(cunt);
        scanner.close();
    }
}
