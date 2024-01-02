 package alpro2latihan;

import java.util.Scanner;

public class latihan3 {
     public static void main(String[] args) {
    Scanner baca = new Scanner(System.in);
    String nama, kelas,semester, nim; 
    Double jumlahkehadiran,tugas,mid,finl,akhir,kehadiran;
    String nhuruf;
    
      System.out.print("masukkan nim : ");
        nim = baca.nextLine();
      System.out.print("masukkan Nama : ");
       nama = baca.nextLine();
      System.out.print("masukkan Semester : ");
        semester = baca.nextLine();
      System.out.print("masukkan Kelas : ");
        kelas = baca.nextLine();
        
      System.out.print("masukkan jumlah kehadiran (1-16): ");
       jumlahkehadiran = baca.nextDouble();
      System.out.print("masukkan nilai akumulasi tugas : ");
        tugas = baca.nextDouble();
      System.out.print("masukkan nilai akumulasi mid : ");
       mid = baca.nextDouble();
      System.out.print("masukkan nilai akumulasi final : ");
        finl = baca.nextDouble();
       
        kehadiran = jumlahkehadiran*6.25 ; //bisa juga pke jumlahkehadiran*100/16
        akhir = (kehadiran * 0.1) + (tugas * 0.2) + (mid * 0.3) + (finl * 0.4);  
        System.out.println("kehadiran :"+kehadiran* 0.1);
         System.out.println("nilai tugas :"+tugas*0.2);
        System.out.println("Nilai mid :"+mid*0.3);
        System.out.println("Nilai final :"+finl*0.4);
        
        System.out.println("Nilai Akhir adalah :"+akhir);
        if ((akhir >=81) && (akhir<=100)) //Jika nilai akhir di antara 80-100
            System.out.println("Nilai Huruf : A");
        else if ((akhir >=71) && (akhir<=81)) //Jika nilai akhir di antara 70-80
            System.out.println("Nilai Huruf : B");
        
        else if ((akhir >=55) && (akhir<=71)) //Jika nilai akhir di antara 55-70
            System.out.println("Nilai Huruf : C");

        else if ((akhir >=31) && (akhir<=55)) //Jika nilai akhir di antara 31-54
            System.out.println("Nilai Huruf : D");

        else if ((akhir<31)) //Jika nilai akhir di antara 0-30
            System.out.println("Nilai Huruf : E");
       
    }
}