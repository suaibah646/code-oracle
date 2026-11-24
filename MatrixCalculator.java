package oracle6;

import java.util.Scanner;

public class MatrixCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] matrixA = new double[2][2];
        double[][] matrixB = new double[2][2];
        boolean isMatrixAInitialized = false;
        boolean isMatrixBInitialized = false;
        char pilihan;

        do {
            System.out.println("\n=== MENU KALKULATOR MATRIKS 2x2 ===");
            System.out.println("a. Masukkan Matriks A");
            System.out.println("b. Masukkan Matriks B");
            System.out.println("c. Tampilkan A + B");
            System.out.println("d. Tampilkan A - B");
            System.out.println("e. Tampilkan A * B");
            System.out.println("f. Keluar");
            System.out.print("Pilih opsi (a-f): ");
            pilihan = scanner.next().charAt(0);

            switch (pilihan) {
                case 'a':
                case 'A':
                    matrixA = inputMatrix(scanner, "Matriks A");
                    isMatrixAInitialized = true;
                    break;
                case 'b':
                case 'B':
                    matrixB = inputMatrix(scanner, "Matriks B");
                    isMatrixBInitialized = true;
                    break;
                case 'c':
                case 'C':
                    if (isMatrixAInitialized && isMatrixBInitialized) {
                        double[][] hasilTambah = tambahMatrix(matrixA, matrixB);
                        System.out.println("\nHasil A + B:");
                        tampilkanMatrix(hasilTambah);
                    } else {
                        System.out.println("\n[!] Harap masukkan Matriks A dan Matriks B terlebih dahulu!");
                    }
                    break;
                case 'd':
                case 'D':
                    if (isMatrixAInitialized && isMatrixBInitialized) {
                        double[][] hasilKurang = kurangMatrix(matrixA, matrixB);
                        System.out.println("\nHasil A - B:");
                        tampilkanMatrix(hasilKurang);
                    } else {
                        System.out.println("\n[!] Harap masukkan Matriks A dan Matriks B terlebih dahulu!");
                    }
                    break;
                case 'e':
                case 'E':
                    if (isMatrixAInitialized && isMatrixBInitialized) {
                        double[][] hasilKali = kaliMatrix(matrixA, matrixB);
                        System.out.println("\nHasil A * B:");
                        tampilkanMatrix(hasilKali);
                    } else {
                        System.out.println("\n[!] Harap masukkan Matriks A dan Matriks B terlebih dahulu!");
                    }
                    break;
                case 'f':
                case 'F':
                    System.out.println("\nKeluar dari program. Terima kasih!");
                    break;
                default:
                    System.out.println("\n[!] Pilihan tidak valid. Silakan pilih a sampai f.");
            }
        } while (pilihan != 'f' && pilihan != 'F');

        scanner.close();
    }

    // Method untuk menerima input matriks 2x2 dari pengguna
    public static double[][] inputMatrix(Scanner scanner, String namaMatrix) {
        double[][] m = new double[2][2];
        System.out.println("\nMasukkan elemen untuk " + namaMatrix + " (ukuran 2x2):");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(namaMatrix + " [" + i + "][" + j + "]: ");
                m[i][j] = scanner.nextDouble();
            }
        }
        return m;
    }

    // Method untuk menampilkan matriks ke layar
    public static void tampilkanMatrix(double[][] m) {
        for (int i = 0; i < 2; i++) {
            System.out.print("[ ");
            for (int j = 0; j < 2; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println("]");
        }
    }

    // Method untuk penjumlahan matriks
    public static double[][] tambahMatrix(double[][] a, double[][] b) {
        double[][] hasil = new double[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                hasil[i][j] = a[i][j] + b[i][j];
            }
        }
        return hasil;
    }

    // Method untuk pengurangan matriks
    public static double[][] kurangMatrix(double[][] a, double[][] b) {
        double[][] hasil = new double[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                hasil[i][j] = a[i][j] - b[i][j];
            }
        }
        return hasil;
    }

    // Method untuk perkalian matriks
    public static double[][] kaliMatrix(double[][] a, double[][] b) {
        double[][] hasil = new double[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                hasil[i][j] = 0;
                for (int k = 0; k < 2; k++) {
                    hasil[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return hasil;
    }
}