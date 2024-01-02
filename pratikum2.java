
package alpro2latihan;

import java.util.Scanner;

public class pratikum2 {
    public static void main (String args[]){ 
       Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan Nilai x: ");
        int x = scanner.nextInt();

        System.out.print("Masukkan Nilai y: ");
        int y = scanner.nextInt();

        int i=x,n=y;
        int total = 1;

        for (int j=0; j<x; j++) {
            total *= n;
            n--;
            System.out.print(n+" ");
        } 
        System.out.println("hasil : "+total);
 }
}
