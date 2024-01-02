
package alpro2latihan;

import java.util.Scanner;

public class pratikum {
    public static void main (String args[]){
    int n1=0;
    int n2=1;
    int i, n;
    System.out.println(" "+n1);
    System.out.println(" "+n2);
    System.out.println("==================");
   for (i= 0; i<10 ;i++)
   {       
      n1= n1+ n2;  
      n= n1; 
      n1=n2; 
      n2=n;
      System.out.print(n1+" ");
        
   }
    }  
}
