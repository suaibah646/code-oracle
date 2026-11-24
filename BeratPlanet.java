import java.util.Scanner;

public class BeratPlanet {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Meminta input berat badan di Bumi
        System.out.print("Masukkan berat Anda di Bumi (lbs): ");
        double beratBumi = input.nextDouble();

        // Menampilkan menu pilihan planet
        System.out.println("\n--- Pilih Planet ---");
        System.out.println("1. Merkurius");
        System.out.println("2. Venus");
        System.out.println("3. Mars");
        System.out.println("4. Jupiter");
        System.out.println("5. Saturnus");
        System.out.println("6. Uranus");
        System.out.println("7. Neptunus");
        System.out.print("Pilih nomor planet (1-7): ");
        int pilihan = input.nextInt();

        double beratPlanet = 0;
        String namaPlanet = "";

        // Menentukan nama planet dan faktor konversi sesuai tabel
        switch (pilihan) {
            case 1:
                namaPlanet = "Merkurius";
                beratPlanet = beratBumi * 0.38;
                break;
            case 2:
                namaPlanet = "Venus";
                beratPlanet = beratBumi * 0.91;
                break;
            case 3:
                namaPlanet = "Mars";
                beratPlanet = beratBumi * 0.38;
                break;
            case 4:
                namaPlanet = "Jupiter";
                beratPlanet = beratBumi * 2.36;
                break;
            case 5:
                namaPlanet = "Saturnus";
                beratPlanet = beratBumi * 0.92;
                break;
            case 6:
                namaPlanet = "Uranus";
                beratPlanet = beratBumi * 0.89;
                break;
            case 7:
                namaPlanet = "Neptunus";
                beratPlanet = beratBumi * 1.13;
                break;
            default:
                System.out.println("Pilihan planet tidak valid!");
                return;
        }

        // Output dengan format kalimat yang diminta soal
        System.out.println("\nYour weight on " + namaPlanet + " is " + beratPlanet + " lbs.");
    }
}