

import java.util.Scanner;

public class MainPlayingCard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Membuat kartu pertama secara acak (Soal No. 7)
        int suitNumber1 = (int)(Math.random() * 4.0 + 1);
        int faceNumber1 = (int)(Math.random() * 13.0 + 1);
        PlayingCard card1 = new PlayingCard(suitNumber1, faceNumber1);

        // Membuat kartu kedua secara acak (Soal No. 7)
        int suitNumber2 = (int)(Math.random() * 4.0 + 1);
        int faceNumber2 = (int)(Math.random() * 13.0 + 1);
        PlayingCard card2 = new PlayingCard(suitNumber2, faceNumber2);

        // Menampilkan kartu yang didapat
        System.out.println("Kartu 1: " + card1);
        System.out.println("Kartu 2: " + card2);

        // Menghitung total poin awal (Soal No. 8a)
        int totalPoints = card1.getPoints() + card2.getPoints();
        int cardCount = 2;

        System.out.println("Total Poin saat ini: " + totalPoints);

        // Soal No. 8b & 8c: Loop untuk menambah kartu (maksimal 5 kartu atau total poin <= 21)
        while (cardCount < 5 && totalPoints <= 21) {
            System.out.print("Apakah Anda ingin kartu lagi? (y/n): ");
            String choice = scanner.nextLine();

            if (choice.equalsIgnoreCase("y")) {
                cardCount++;
                int suitNum = (int)(Math.random() * 4.0 + 1);
                int faceNum = (int)(Math.random() * 13.0 + 1);
                PlayingCard newCard = new PlayingCard(suitNum, faceNum);

                System.out.println("Kartu #" + cardCount + ": " + newCard);
                totalPoints += newCard.getPoints();
                System.out.println("Total Poin sekarang: " + totalPoints);
            } else {
                break; // Pengguna memilih untuk tidak mengambil kartu lagi
            }
        }

        // Pesan akhir permainan
        System.out.println("\nPermainan selesai!");
        System.out.println("Jumlah total kartu di tangan: " + cardCount);
        System.out.println("Total akhir poin Anda: " + totalPoints);
        
        scanner.close();
    }
}