import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class A767 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, x, z;
        HashSet<Integer> hash = new HashSet<>();
        n = scanner.nextInt();
        z = n;
        int[] arr = new int[n];
        for (int i = 0; n > i; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; n > i; i++) {
            x = arr[i];
            hash.add(x);
            if (hash.contains(z)) {
                List<Integer> sortedList = new ArrayList<>(hash);
                Collections.sort(sortedList, Collections.reverseOrder());
                for (int num : sortedList) {
                    if( num == z){
                    System.out.print(num + " ");
                    hash.remove(num);
                    z--;
                    }
                }
            } else {
                System.out.println("");
            }
        }
        scanner.close();
    }
}