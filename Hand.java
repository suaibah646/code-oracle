package oracle6;

public class Hand {
    Card[] cards = new Card[5]; // Poin b: Berisi array dari 5 referensi Card
    int cardCount = 0;

    public void addCard(Card c) {
        if (cardCount < 5) {
            cards[cardCount] = c;
            cardCount++;
        }
    }

    // Poin c: Menghitung total poin dan menyesuaikan Ace jika > 21
    public int getPoints() {
        int total = 0;
        int aceCount = 0;

        for (int i = 0; i < cardCount; i++) {
            total += cards[i].points;
            if (cards[i].name.equals("Ace")) {
                aceCount++;
            }
        }

        // Jika total poin melebihi 21 dan ada Ace yang dihitung 11, kurangi nilai menjadi 1 (-10 poin)
        while (total > 21 && aceCount > 0) {
            total -= 10;
            aceCount--;
        }

        return total;
    }

    public void printHand() {
        for (int i = 0; i < cardCount; i++) {
            System.out.println(" - " + cards[i]);
        }
    }
}