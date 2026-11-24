import java.util.Scanner;

public class FinalExam {

    public static void main(String[] args) {
        double average;
        int daysAbsent;
        boolean exempt = false;
        Scanner reader = new Scanner(System.in);

        System.out.println("This program will determine if you can get out of the final exam.");
        System.out.println("Please answer the following questions.");
        
        System.out.println("What is your average in the class?");
        average = reader.nextDouble();
        
        System.out.println("How class lectures have you missed?");
        daysAbsent = reader.nextInt();

        // SOAL NO 6: Disederhanakan menjadi SATU pernyataan if menggunakan operator logika (|| dan &&)
        if ((average >= 90 && daysAbsent <= 3) || (average >= 80 && daysAbsent == 0)) {
            exempt = true;
        }

        // Menampilkan hasil status pengecualian ujian
        if (exempt) {
            System.out.println("\nSelamat! Anda dibebaskan dari ujian akhir.");
        } else {
            System.out.println("\nAnda wajib mengikuti ujian akhir.");
        }
    }
}
