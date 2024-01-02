package alpro2latihan;

public class Latihan_Looping1 {
    public static void main(String args[])
    {
        int i=0, genap=0,ganjil =0;
        float total =0, rata=0, total1=0;
        
        System.out.println("Ini hasil do While");
        System.out.println("==============");
        
        do {
            i++;
            if (i%2 == 0)
            System.out.print(i+" ");
            
        }while (i<10);
        System.out.println(" ");
        System.out.println("==============");
        System.out.println("Ini hasil for");
        System.out.println("==============");

        for (i=1;i<=10;i++)
        {
          if (i%2 == 0)
          {  
            System.out.println(i+" adalah bilang genap");
            total = total +i;
            genap = genap+1;
          } 
          if (i%2 != 0)
          {
            System.out.println(i+" adalah bilang Ganjil");
            total1=total1+i;
            ganjil++;
            
          }
        }
        System.out.println(" ");
        rata= total/genap;
        System.out.println("Total Genap= "+total);
        System.out.println("Jumlah Genap = "+genap);
        System.out.println("Rata-rata = "+rata);
        
        System.out.println(" ");
        rata= total1/ganjil;
        System.out.println("Total Ganjil= "+total1);
        System.out.println("Jumlah Ganjil= "+ganjil);
        System.out.println("Rata-rata Ganjil= "+rata);
   
    }
    
    
}
