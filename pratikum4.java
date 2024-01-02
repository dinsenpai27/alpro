
package alpro2latihan;

import java.util.Scanner;

public class pratikum4 {
    public static double hitungJarak(double x1, double y1, double x2, double y2) {
        double jarak = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return jarak;
    }   

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Program Menghitung Jarak Dua Titik Pusat");
        
        System.out.print("Masukkan koordinat x titik pertama: ");
        double x1 = input.nextDouble();
        System.out.print("Masukkan koordinat y titik pertama: ");
        double y1 = input.nextDouble();
        System.out.print("Masukkan koordinat x titik kedua: ");
        double x2 = input.nextDouble();
        System.out.print("Masukkan koordinat y titik kedua: ");
        double y2 = input.nextDouble();

        double jarak = hitungJarak(x1, y1, x2, y2);
        System.out.printf("Jarak antara titik pertama dan titik kedua adalah: %.2f\n", jarak);
    }
}   
