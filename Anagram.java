import java.util.Scanner;
import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Program Pengecek Anagram");
        System.out.print("Masukkan kata/frasa pertama: ");
        String str1 = scanner.nextLine();

        System.out.print("Masukkan kata/frasa kedua: ");
        String str2 = scanner.nextLine();

        // Memanggil fungsi untuk mengecek anagram
        if (isAnagram(str1, str2)) {
            System.out.println("\nHasil: KEDUANYA ADALAH anagram!");
        } else {
            System.out.println("\nHasil: BUKAN anagram.");
        }
    }

    public static boolean isAnagram(String s1, String s2) {
        // 1. Ubah ke huruf kecil semua (case-insensitive) dan buang semua spasi serta tanda baca
        // Menggunakan regex [^a-zA-Z0-9] untuk menghapus selain huruf dan angka
        String clean1 = s1.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String clean2 = s2.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Jika panjang karakternya setelah dibersihkan berbeda, sudah pasti bukan anagram
        if (clean1.length() != clean2.length()) {
            return false;
        }

        // 2. Ubah string menjadi array karakter, lalu urutkan (sort)
        char[] charArray1 = clean1.toCharArray();
        char[] charArray2 = clean2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // 3. Bandingkan kedua array karakter yang sudah diurutkan
        return Arrays.equals(charArray1, charArray2);
    }
}
