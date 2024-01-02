 
package alpro2latihan;

public class looping_bersarang1 {
    public static void main (String args [])
    {
        int pb = 5;
        int pk=7;
        int a=5; 
       for (int i=1; i<=5; i++)
       {
           for(int j=1; j<=5; j++){
           a+=pk;
           System.out.print(a+" ");
       }
           a -=pb;
       System.out.println();
       }
      
    }
    
}
