public class MainStudentLama {
    public static void main(String[] args) {
        // Membuat tiga objek Student: (Nama, Kredit, Poin Mutu)
        StudentLama mary = new StudentLama("Mary Jones", 14, 46);
        StudentLama john = new StudentLama("John Stiner", 60, 173);
        StudentLama ari = new StudentLama("Ari Samala", 31, 69);

        // Menampilkan data awal mahasiswa dengan format 2 angka di belakang koma
        System.out.println("=== DATA AWAL MAHASISWA ===");
        System.out.printf("Nama: %-12s | IP (GPA): %.2f\n", mary.name, mary.gpa);
        System.out.printf("Nama: %-12s | IP (GPA): %.2f\n", john.name, john.gpa);
        System.out.printf("Nama: %-12s | IP (GPA): %.2f\n", ari.name, ari.gpa);

        // Menguji method addCourse (menambah 13 kredit & 52 poin mutu ke Ari Samala)
        ari.addCourse(13, 52);
        System.out.println("\n=== SETELAH ARI MENAMBAH MATA KULIAH ===");
        System.out.printf("Nama: %-12s | Kredit Baru: %d | IP Baru: %.2f\n", ari.name, ari.credits, ari.gpa);
    }
}