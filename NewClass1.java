
package alpro2latihan;

import java.util.Scanner;
public class NewClass1 {
   
    public static void main(String[] args){
        Scanner baca = new Scanner(System.in);
        
        float koefisien_1, koefisien_2, koefisien_3, costanta;
        float pangkat_1, pangkat_2, pangkat_3;
        char operator_1, operator_2, operator_3;
        
        System.out.print("Masukkan nilai x1 : ");
        koefisien_1 = baca.nextFloat();
        System.out.print("Masukkan nilai y1 : ");
        koefisien_2 = baca.nextFloat();
        System.out.print("Masukkan nilai z1 : ");
        koefisien_3 = baca.nextFloat();
      
        System.out.print("Masukkan nilai x2 : ");
        pangkat_1 = baca.nextFloat();
        System.out.print("Masukkan nilai y2 : ");
        pangkat_2 = baca.nextFloat();
        System.out.print("Masukkan nilai z2 : ");
        pangkat_3 = baca.nextFloat();
        
        System.out.print("Masukkan nilai x3 : ");
        operator_1 = baca.next().charAt(0);
        System.out.print("Masukkan nilai y3 : ");
        operator_2 = baca.next().charAt(0);
        System.out.print("Masukkan nilai z3 : ");
        operator_3 = baca.next().charAt(0);
        
        koefisien_1 = koefisien_1 * pangkat_1;   pangkat_1--;
        System.out.println(koefisien_1 );
        koefisien_2 = koefisien_2 * pangkat_2;   pangkat_2--;
        System.out.println(koefisien_2 );
        koefisien_3 = koefisien_3 * pangkat_3;   pangkat_3--;
        System.out.println(koefisien_3 );
        
        float nilai_variabel, hasil_1=1;
        System.out.print("Masukkan nilai A : ");
        nilai_variabel = baca.nextFloat();
        
        for (int i=0;i<pangkat_1;i++)
            hasil_1 *= nilai_variabel;
        System.out.println(hasil_1+"hasil1");
        
        koefisien_1 *= hasil_1; float hasil_2=1;
        System.out.println("Hasil Nilai adalah ="+ koefisien_1);
        for (int i=0;i<pangkat_2;i++)
            hasil_2 *= nilai_variabel;
        System.out.println(hasil_2);
        
        koefisien_2 *= hasil_2; float hasil_3=1;
        System.out.println("Hasil Nilai adalah ="+ koefisien_2);
        for (int i=0;i<pangkat_3;i++)
            hasil_3 *= nilai_variabel;
        System.out.println(hasil_3);
        
        koefisien_3 *= hasil_3;
        System.out.println("Hasil Nilai adalah ="+ koefisien_3);
        float total = 0;
        
        if (operator_1=='+')
            total = koefisien_1 + koefisien_2;
        else if (operator_1=='-')
            total = koefisien_1 - koefisien_2;
        if (operator_2=='+')
            total += koefisien_3;
        else
            total -= koefisien_3;
        
        System.out.println("Total Nilai adalah = "+total);
    }
}