import java.util.Scanner;
public class A785 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s;
        int n,r = 0;
        n = scanner.nextInt();
        for(int i = 0;n > i;i++){
            s = scanner.next();
            if(s.equals("Tetrahedron")){
                r += 4;
            }
            else if(s.equals("Cube")){
                r += 6;
            }
            else if(s.equals("Octahedron")){
                r += 8;
            }
            else if(s.equals("Dodecahedron")){
                r += 12;
            }
            else if(s.equals("Icosahedron")){
                r += 20;
            }
        }
            System.out.println(r);
            scanner.close();
    }
}
