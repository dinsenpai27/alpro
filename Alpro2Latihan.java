package alpro2latihan;

import java.util.Scanner;

public class Alpro2Latihan {

    public static void main(String[] args) {
      
         Scanner baca = new Scanner(System.in);
         int bil;  
         System.out.print("masukkan bilangan : ");
         bil=baca.nextInt();
         
         if (bil%2==0)
             System.out.println("bilangan genap");
         else {
             System.out.println("bilangan ganjil");
         }
          
    }
    
}
