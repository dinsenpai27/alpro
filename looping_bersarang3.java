 
package alpro2latihan;

import java.util.Scanner;

public class looping_bersarang3 {
    public static void main (String args []){
        Scanner scanner = new Scanner(System.in);
System.out.print("Masukkan Nilai x: ");
        int n = scanner.nextInt();
        
        for (int i = 1; i <= n; i++) {
            int k = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    k++;
                }
            }
            
            if (k <= 2) {
                System.out.print(i + " ");
            }
        }

        scanner.close();
    }
}
        