import java.util.Scanner;

public class PesanRahasia {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String pesanHasil = "";

        System.out.println("Masukkan 10 angka satu per satu (angka 1 sampai 7):");

        int count = 0;
        while (count < 10) {
            System.out.print("Masukkan angka ke-" + (count + 1) + ": ");
            int angka = input.nextInt();

            String huruf = "";
            boolean valid = true;

            // Menerjemahkan angka sesuai instruksi soal
            switch (angka) {
                case 1: huruf = "D"; break;
                case 2: huruf = "W"; break;
                case 3: huruf = "E"; break;
                case 4: huruf = "L"; break;
                case 5: huruf = "H"; break;
                case 6: huruf = "O"; break;
                case 7: huruf = "R"; break;
                default:
                    System.out.println("Angka belum terpecahkan! Masukkan angka yang valid (1-7).");
                    valid = false; // Jika salah, tidak dihitung sebagai input yang sah
                    break;
            }

            // Jika angka valid (1-7), masukkan ke dalam pesan dan lanjut ke angka berikutnya
            if (valid) {
                pesanHasil += huruf;
                count++;
            }
        }

        System.out.println("\nPesan rahasia yang terurai adalah: " + pesanHasil);
    }
}
