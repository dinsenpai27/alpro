
package alpro2latihan;

import java.util.Random;
import java.util.Scanner;
public class pratikum5 {

    public static void main (String args[]) throws InterruptedException{
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int i=1, ji=24; 
        int K=0 ,D=0, P=0,B=1, tb = 0;
         System.out.print("Masukkan Nilai x1: ");
        int n = scanner.nextInt();
        System.out.print("Masukkan Nilai x2: ");
       int m = scanner.nextInt();
        do{
            K=rand.nextInt(2)+1;
        if (K==2)
        {
            D = (int) (0.2*n);
            K=rand.nextInt(n);
        }
            if(K==0){
                P=(int) (0.02*n);
            }
            B=m+D-P;
            tb +=B; 
            i++; 
            Thread.sleep(1000);
            System.out.println("nilai k: "+K);
            System.out.println("nilai d: "+D);
            System.out.println("nilai p: "+P);
            System.out.println("nilai b: "+B);
            System.out.println("nilai tb: "+tb);
        }while ((i < ji) && (tb <= n));
        System.out.println();
    }
}
