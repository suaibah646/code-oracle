// KODE UNTUK NOMOR 4 (Object Class Student)
class Student {
    String fName;
    String lName;
    int stuId;
    String stuStatus;

    // Constructor untuk mengisi data siswa
    public Student(String fName, String lName, int stuId, String stuStatus) {
        this.fName = fName;
        this.lName = lName;
        this.stuId = stuId;
        this.stuStatus = stuStatus;
    }

    // Method untuk menampilkan informasi siswa
    public void displayInfo() {
        System.out.println("Student Name: " + fName + " " + lName);
        System.out.println("Student ID: " + stuId);
        System.out.println("Student Status: " + stuStatus);
    }
}

// KODE UNTUK NOMOR 5 (Driver Class)
public class StudentDriver {

    public static void main(String[] args) {
        // Bikin object Student sesuai data di nomor 4
        Student student1 = new Student("Lisa", "Palombo", 123456789, "Active");

        // Cetak informasi object ke layar
        student1.displayInfo();
    }
}