
package alpro2latihan;

public class latihan1 {
    public static void main(String args[])
    {
        float modal = 5000000;//deklarasi variabel
        float harga_jual = 6000000;
        float untung = harga_jual-modal;
        
        System.out.println("Harga Jual = "+harga_jual+" Rupiah");
        System.out.println("modal = "+modal+" Rupiah");
        System.out.println("untung = "+untung+" Rupiah");
       
        if (harga_jual>modal)
              System.out.println("Saya untung");
        else
              System.out.println("Saya rugi");
       
    }
}
