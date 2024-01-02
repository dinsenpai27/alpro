package alpro2latihan;

public class pratikum7 {

    public static void main(String[] args) {
        int a = 5;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                if (i == j || i + j == a - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        int baris = 5;  
        int kolom = 5;

        for (int i = 1; i <= baris; i++) {
            for (int j = 1; j <= kolom; j++) {
                if (i == 1 || i == baris || j == 1 || j == kolom || i == baris / 2 + 1) {
                    System.out.print("+");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
                                                                                            