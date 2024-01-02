
package alpro2latihan;

import java.util.Scanner;

public class practice {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilihan;
        float R1, R2, R3, R4, I, V = 0;
        System.out.println("jenis rangkaian : ");
        System.out.println("1. seri");
        System.out.println("2. paralel");

        System.out.print("masukkan pilihan : ");
        pilihan = scanner.nextInt();

        if (pilihan == 1) {
            System.out.print("masukkan R1 : ");
            R1 = scanner.nextFloat();
            System.out.print("masukkan R3 : ");
            R3 = scanner.nextFloat();
            System.out.print("masukkan R4 : ");
            R4 = scanner.nextFloat();

            // Menghitung resistor total dalam rangkaian seri
            V = (R1 + R3 + R4);
        } else if (pilihan == 2) {
            System.out.print("masukkan nilai R2 : ");
            R2 = scanner.nextFloat();

            // Menghitung resistor total dalam rangkaian paralel
            V = 1 / R2;
        }

        System.out.print("masukkan nilai arus (I) : ");
        I = scanner.nextFloat();

        // Menghitung tegangan (V) menggunakan rumus V = I * R
        V = I * V;

        System.out.println("maka nilai V nya adalah : "+V);
   }
}
