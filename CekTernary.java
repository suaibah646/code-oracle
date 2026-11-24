import java.util.Scanner;

public class CekTernary {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai x: ");
        int x = input.nextInt();

        // Operator ternary untuk mengecek apakah x <= 7
        boolean hasil = (x <= 7) ? true : false;

        System.out.println("Apakah x kurang dari atau sama dengan 7? " + hasil);
    }
}