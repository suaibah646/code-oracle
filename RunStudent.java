import java.util.Date;

public class RunStudent {
    public static void main(String[] args) {
        Student mhs = new Student("Budi", "Setiawan", "Pratama", new Date(), "12345678", "Teknik Informatika", "Sarjana", 2027);

        System.out.println("Nama Mahasiswa : " + mhs.getName());
        System.out.println("NIM            : " + mhs.getNim());
        System.out.println("Jurusan Awal   : " + mhs.getMajor());

        mhs.changeMajor("Ilmu Komputer");
        System.out.println("Jurusan Baru   : " + mhs.getMajor());

        String[] nilaiKuliah = {"A", "B+", "A-", "B"};
        mhs.calculateGPA(nilaiKuliah);
        System.out.println("IP (GPA)       : " + mhs.getGpa());
    }
}