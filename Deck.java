package oracle6;

import java.util.Random;

public class Deck {
    Card[] cardArray = new Card[52];
    int nextCardIndex = 0;

    Deck() {
        int suits = 4;
        int cardType = 13;
        int cardCount = 0;
        for (int i = 1; i <= suits; i++) {
            for (int j = 1; j <= cardType; j++) {
                cardArray[cardCount] = new Card(i, j);
                cardCount++;
            }
        }
    }

    // Poin a: Method shuffle untuk mengacak kartu
    public void shuffle() {
        Random rand = new Random();
        for (int i = 0; i < cardArray.length; i++) {
            int j = rand.nextInt(cardArray.length);
            Card temp = cardArray[i];
            cardArray[i] = cardArray[j];
            cardArray[j] = temp;
        }
        nextCardIndex = 0; // Reset index setelah diacak
    }

    // Method untuk membagikan kartu satu per satu
    public Card dealCard() {
        if (nextCardIndex < cardArray.length) {
            return cardArray[nextCardIndex++];
        }
        return null;
    }

    public void print() {
        for (int i = 0; i < cardArray.length; i++) {
            System.out.println(cardArray[i]);
        }
    }
}