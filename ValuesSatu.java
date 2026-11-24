package oracle6;

public class ValuesSatu {
    public static void main(String[] args) {
        // 2. Deklarasi dan inisialisasi array byte 1D berukuran 10
        byte[] values = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};

        // Menampilkan isi array ke terminal
        System.out.print("Isi dari array values: ");
        for (int i = 0; i < values.length; i++) {
            System.out.print(values[i] + " ");
        }
        System.out.println();
    }
}
