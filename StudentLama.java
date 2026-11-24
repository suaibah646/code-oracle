public class StudentLama {
    String name;
    int credits;
    int gradePoints; // Poin Mutu
    double gpa;      // Indeks Prestasi (IP/GPA)

    // Constructor method
    public StudentLama(String name, int credits, int gradePoints) {
        this.name = name;
        this.credits = credits;
        this.gradePoints = gradePoints;
        this.gpa = getGPA(); // Memanggil method getGPA untuk mengisi nilai awal gpa
    }

    // a. Method untuk menghitung rata-rata IP saat ini (poin mutu / kredit)
    public double getGPA() {
        if (credits > 0) {
            // Menggunakan (double) di depan gradePoints agar pembagian pecahan akurat
            return (double) gradePoints / credits;
        }
        return 0.0;
    }

    // b. Method untuk menambah kredit dan poin mutu baru
    public void addCourse(int newCredits, int newGradePoints) {
        this.credits += newCredits;
        this.gradePoints += newGradePoints;
        this.gpa = getGPA(); // Memperbarui nilai gpa setelah ada penambahan kursus
    }
}