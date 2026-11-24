import java.util.Scanner;

public class segitiga {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan alas (b): ");
        double b = input.nextDouble();

        System.out.print("Masukkan tinggi (h): ");
        double h = input.nextDouble();

        // Rumus: A = (1/2) * b * h
        double A = 0.5 * b * h;

        System.out.println("Luas Segitiga (A): " + A);
    }
}