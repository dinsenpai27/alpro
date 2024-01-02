package alpro2latihan;

import java.util.Scanner;

public class Latihan_looping2 {
    public static void main (String args[])
    {
        String inputan;
        Scanner baca = new Scanner(System.in);
        System.out.println("Masukkan nama : ");
        inputan=baca.nextLine();
        
        do {
            System.out.print ("Masukkan nama ");
            inputan=baca.nextLine();
        }while (inputan.equalsIgnoreCase("fahrim"));
        
            
    }
}
