public class TugasString {

    public static void main(String[] args) {
        // --- JAWABAN NO 2 ---
        String s1 = "ABC";
        String s2 = new String("DEF");
        String s3 = "AB" + "C";

        System.out.println("=== HASIL NO 2 ===");
        System.out.println("a. s1.compareTo(s2) : " + s1.compareTo(s2)); // Hasil: -3
        System.out.println("b. s2.equals(s3)    : " + s2.equals(s3)); // Hasil: false
        System.out.println("c. s3 == s1         : " + (s3 == s1)); // Hasil: true
        System.out.println("d. s2.compareTo(s3) : " + s2.compareTo(s3)); // Hasil: 3
        System.out.println("e. s3.equals(s1)    : " + s3.equals(s1)); // Hasil: true

        System.out.println();

        // --- JAWABAN NO 3 ---
        System.out.println("=== HASIL NO 3 ===");
        String teks1 = "Halo ";
        String teks2 = "Dunia!";
        String teks3 = teks1 + teks2; // Penggabungan dua String

        System.out.println("Teks 1 : " + teks1);
        System.out.println("Teks 2 : " + teks2);
        System.out.println("Teks 3 : " + teks3);
    }
}
