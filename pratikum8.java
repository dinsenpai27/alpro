package alpro2latihan;

import java.util.Random;
import java.util.Scanner;

public class pratikum8 { 

    public static void main(String[] args) throws InterruptedException {
        double M;
        double Tt, Ad, R = 0, B = 0;
        int T, Kb = 0, Pb, L = 0;
        Scanner scanner = new Scanner(System.in);

        Random random = new Random();
        M = random.nextDouble();

        do {
            T = random.nextInt(4);  
            if (T == 0) {
                System.out.println("M = " + M);
            } else if (T == 1) {
                System.out.println("Masukkan nilai Tt = ");
                Tt = random.nextDouble();
                M = M - Tt;
                System.out.println("Tt = " + Tt);
                System.out.println("M = " + M);
            } else if (T == 2) {
                Kb = random.nextInt(2);
                System.out.println("Kb = " + Kb);
                if (Kb != 1)
                    Ad = 2500;
                else
                    Ad = 0;
                R = random.nextInt(100) + 1;
                System.out.println("R = " + R);
                M = M - R - Ad;
                System.out.println("M = " + M);
            } else if (T == 3) {
                do {
                    Pb = random.nextInt(2);
                    System.out.println("B = " + B);
                    B = random.nextDouble();
                    M = M - B;
                    System.out.println("M = " + M);
                } while (Pb == 1);
                L = random.nextInt(2);
            } else {
                L = random.nextInt(2);
                 System.out.println("L = " + L);
            }
        } while (L == 1);

        Thread.sleep(1000);
    }
}
