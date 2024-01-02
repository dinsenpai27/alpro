package alpro2latihan;


public class latihan_Looping_bersarang {
    public static void main (String args [])
    {
        System.out.println("For Bersarang ");
        for (int baris=1;baris<=5;baris++)
        {
            for(int kolom=1; kolom<=baris;kolom++)
            {
                System.out.print(kolom+" ");
                
            }
            System.out.println("di sini batas pindah baris");
            //System.out.println();
            
        }
        int angka = 1;
    for (int baris=1;baris<=4;baris++)
        {
            for(int kolom_spasi=3; kolom_spasi>=baris;kolom_spasi--)
            {
                System.out.print(" ");
                
            }
            for(int kolom_angka=0; kolom_angka<baris;kolom_angka++)
            {
                System.out.print(angka+++" ");
                
            }
            System.out.println();
            //System.out.println();
            
        }
    angka -=2;
     for (int baris=3;baris>=1;baris--)
        {
            for(int kolom_spasi=3; kolom_spasi>=baris;kolom_spasi--)
            {
                System.out.print(" ");
                
            }
            for(int kolom_angka=1; kolom_angka<=baris;kolom_angka++)
            {
                System.out.print(angka--+" ");
                
            }
            System.out.println();
            //System.out.println();
            
        }
       for (int baris = 1; baris<=5; baris++)
       {
           for (int kolom= 1;kolom<=5; kolom++)
           {
               System.out.print("*"+" ");
           }
           System.out.println();
       }

    }
}
