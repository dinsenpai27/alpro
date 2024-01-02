
package alpro2latihan;

public class looping_bersarang2 {
    public static void main (String args []){
        double a = 87;
         for (int i = 1; i <= 5; i++) {
            
            for (int j = 5; j >= i; j--) {
                char b = (char) a;
                System.out.print(b + " ");
                b += 9;
            }
            System.out.println(); 
        }
    }
}