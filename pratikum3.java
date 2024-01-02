
package alpro2latihan;
import java.util.Scanner;
public class pratikum3 {

    public static void main(String[] args) {
        int coef1, coef2, coef3, constant, exp1, exp2, exp3, var_value, result1 = 1, result2 = 1, result3 = 1, total = 0;
        char operator1, operator2;

        Scanner input = new Scanner(System.in);

        // Coefficients
        System.out.print("Masukkan Nilai Koefisien 1 : ");
        coef1 = input.nextInt();

        System.out.print("Masukkan Nilai Koefisien 2 : ");
        coef2 = input.nextInt();

        System.out.print("Masukkan Nilai Koefisien 3 : ");
        coef3 = input.nextInt();

        System.out.print("Masukkan Nilai Constanta : ");
        constant = input.nextInt();

        // Exponents
        System.out.print("Masukkan Nilai Pangkat 1 : ");
        exp1 = input.nextInt();

        System.out.print("Masukkan Nilai Pangkat 2 : ");
        exp2 = input.nextInt();

        System.out.print("Masukkan Nilai Pangkat 3 : ");
        exp3 = input.nextInt();

        // Variable value
        System.out.print("Masukkan Nilai Variabel : ");
        var_value = input.nextInt();

        // Operators
        System.out.print("Masukkan Operator 1 (+ or -):");
        operator1 = input.next().charAt(0);

        System.out.print("Masukkan Operator 2 (+ or -):");
        operator2 = input.next().charAt(0);

        // Output Initial Expression
        System.out.print("Nilai awal : " + coef1 + "x^" + exp1 + " " + operator1 + " " + coef2 + "x^" + exp2 + " " + operator2 + " " + coef3 + "x^" + exp3 + " + " + constant);

        // Process
        coef1 *= exp1;
        coef2 *= exp2;
        coef3 *= exp3;

        exp1 -= 1;
        exp2 -= 1;
        exp3 -= 1;

        for (int i = 0; i < exp1; i++) {
            result1 *= var_value;
        }
        coef1 *= var_value;

        for (int i = 0; i < exp2; i++) {
            result2 *= var_value;
        }
        coef2 *= var_value;

        for (int i = 0; i < exp3; i++) {
            result3 *= var_value;
        }
        coef3 *= var_value;

        if (operator1 == '+') {
            total = coef1 + coef2;
        } else if (operator1 == '-') {
            total = coef1 - coef2;
        }

        if (operator2 == '+') {
            total += coef3;
        } else if (operator2 == '-') {
            total -= coef3;
        }

        total += constant;

        System.out.println();
        System.out.println("Nilai akhir : " + total);
    }
}