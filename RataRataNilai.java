package oracle6;

import java.util.Scanner;

public class RataRataNilai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] nilaiTes = new double[5];
        double total = 0;

        System.out.println("Masukkan 5 nilai tes (skor maksimal 100):");
        
        // Menerima input 5 nilai tes dan menyimpannya ke dalam array
        for (int i = 0; i < 5; i++) {
            System.out.print("Nilai tes ke-" + (i + 1) + ": ");
            nilaiTes[i] = scanner.nextDouble();
            total += nilaiTes[i]; // Menjumlahkan semua nilai
        }

        // Menghitung rata-rata
        double rataRata = total / 5;

        // Menampilkan hasil rata-rata
        System.out.println("\nRata-rata dari kelima nilai tes tersebut adalah: " + rataRata);
        
        scanner.close();
    }
}