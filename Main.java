package oracle6;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        Deck d = new Deck();
        d.shuffle(); // Verifikasi shuffle dipanggil dari Main (Poin a)

        System.out.println("=== SELAMAT DATANG DI PERMAINAN KARTU 21 ===");

        Hand userHand = new Hand();
        Hand dealerHand = new Hand();

        // Poin b: Mendistribusikan 2 kartu ke Hand pengguna & dealer
        userHand.addCard(d.dealCard());
        userHand.addCard(d.dealCard());

        dealerHand.addCard(d.dealCard());
        dealerHand.addCard(d.dealCard());

        // Giliran Pengguna
        boolean userTurn = true;
        while (userTurn) {
            System.out.println("\nKartu di tangan Anda:");
            userHand.printHand();
            int currentPoints = userHand.getPoints();
            System.out.println("Total poin Anda: " + currentPoints);

            if (currentPoints > 21) {
                System.out.println("Poin Anda melebihi 21! Anda Bust (Kalah).");
                scanner.close();
                return;
            }

            if (userHand.cardCount >= 5) {
                System.out.println("Anda sudah mencapai batas maksimum 5 kartu!");
                break;
            }

            System.out.print("Apakah Anda ingin mengambil kartu lagi? (y/n): ");
            char choice = scanner.next().charAt(0);
            if (choice == 'y' || choice == 'Y') {
                userHand.addCard(d.dealCard());
            } else {
                userTurn = false;
            }
        }

        // Poin d: Giliran Dealer (berhenti jika poin >= 16)
        while (dealerHand.getPoints() < 16 && dealerHand.cardCount < 5) {
            dealerHand.addCard(d.dealCard());
        }

        System.out.println("\n--- HASIL AKHIR ---");
        System.out.println("Kartu Dealer:");
        dealerHand.printHand();
        int dealerPoints = dealerHand.getPoints();
        System.out.println("Total poin Dealer: " + dealerPoints);

        int userPoints = userHand.getPoints();
        System.out.println("Total poin Anda: " + userPoints);

        // Penentuan Pemenang
        if (dealerPoints > 21 || (userPoints <= 21 && userPoints > dealerPoints)) {
            System.out.println("\nSelamat! Anda mengalahkan Dealer!");
        } else if (userPoints <= 21 && userPoints == dealerPoints) {
            System.out.println("\nSeri (Draw)!");
        } else {
            System.out.println("\nDealer memenangkan permainan!");
        }

        scanner.close();
    }
}