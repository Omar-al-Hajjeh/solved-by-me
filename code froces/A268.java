import java.util.Scanner;
public class A268 {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        int cunt = 0,n = scanner.nextInt();
        int[] first = new int[n];
        int [] second = new int[n];
        for(int i=0; i < n ;i++){
            first[i] = scanner.nextInt();
            second[i] = scanner.nextInt();
        }
        for(int i : first){
            for(int j : second){
                if(i == j){
                    cunt++;
                }
            }
        }
        System.out.println(cunt);
        scanner.close();

    }
    
}
