package alpro2latihan;

import java.util.Scanner;

public class latihan2 {
    public static void main(String args[])
    {
        Scanner baca = new Scanner (System.in);
        float modal, untung, harga_jual;
        
        System.out.print("Modal : ");
        modal = baca.nextFloat();
          System.out.print("Harga Jual = ");
          harga_jual=baca.nextFloat();
        untung = harga_jual-modal;
        
    }
}
