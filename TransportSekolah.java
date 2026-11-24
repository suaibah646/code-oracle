
import java.util.Scanner;

public class TransportSekolah {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan total jumlah pendaftar: ");
        int totalOrang = input.nextInt();

        int kapasitasBus = 45;

        // Menghitung bus yang terisi penuh
        int jumlahBus = totalOrang / kapasitasBus;

        // Menghitung sisa orang yang naik van
        int jumlahOrangVan = totalOrang % kapasitasBus;

        System.out.println("Jumlah bus yang diperlukan: " + jumlahBus);
        System.out.println("Jumlah orang yang harus naik van: " + jumlahOrangVan);
    }
}