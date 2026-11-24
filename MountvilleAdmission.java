import java.util.Scanner;

public class MountvilleAdmission {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== SELEKSI MASUK MOUNTVILLE UNIVERSITY ===");
        
        // Meminta input dari pengguna
        System.out.print("Apakah anda valedictorian atau salutatorian? (ya/tidak): ");
        String statusSiswa = input.next().toLowerCase();
        
        int jumlahSiswaSekolah = 0;
        if (statusSiswa.equals("ya")) {
            System.out.print("Berapa jumlah siswa di sekolah anda? ");
            jumlahSiswaSekolah = input.nextInt();
        }

        System.out.print("Masukkan nilai GPA Anda (contoh: 3.8): ");
        double gpa = input.nextDouble();

        System.out.print("Masukkan skor SAT Anda (contoh: 1200): ");
        int sat = input.nextInt();

        // Mengecek kriteria penerimaan (cukup memenuhi salah satu)
        boolean diterima = false;

        // Kriteria 1: Valedictorian/salutatorian dari sekolah dengan >= 1400 siswa
        if ((statusSiswa.equals("ya")) && (jumlahSiswaSekolah >= 1400)) {
            diterima = true;
        }
        // Kriteria 2: GPA >= 4.0 dan SAT >= 1100
        else if (gpa >= 4.0 && sat >= 1100) {
            diterima = true;
        }
        // Kriteria 3: GPA >= 3.5 dan SAT >= 1300
        else if (gpa >= 3.5 && sat >= 1300) {
            diterima = true;
        }
        // Kriteria 4: GPA >= 3.0 dan SAT >= 1500
        else if (gpa >= 3.0 && sat >= 1500) {
            diterima = true;
        }

        // Output hasil seleksi
        if (diterima) {
            System.out.println("\nSelamat! Anda DITERIMA di Mountville University.");
        } else {
            System.out.println("\nMohon maaf, Anda BELUM DITERIMA di Mountville University.");
        }
    }
}