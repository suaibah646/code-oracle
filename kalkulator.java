import java.util.Scanner;

public class kalkulator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        double angka1 = input.nextDouble();

        System.out.print("Masukkan angka kedua: ");
        double angka2 = input.nextDouble();

        System.out.print("Masukkan operator (*, +, /, %, -): ");
        char operator = input.next().charAt(0);

        double hasil = 0;
        boolean valid = true;

        switch (operator) {
            case '+':
                hasil = angka1 + angka2;
                break;
            case '-':
                hasil = angka1 - angka2;
                break;
            case '*':
                hasil = angka1 * angka2;
                break;
            case '/':
                if (angka2 != 0) {
                    hasil = angka1 / angka2;
                } else {
                    System.out.println("Error: Pembagian dengan nol!");
                    valid = false;
                }
                break;
            case '%':
                hasil = angka1 % angka2;
                break;
            default:
                System.out.println("Error: Operator tidak valid!");
                valid = false;
                break;
        }

        if (valid) {
            System.out.println("Hasil: " + hasil);
        }
    }
}