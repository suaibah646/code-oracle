package oracle6;

public class Card {
    String suit, name;
    int points;

    Card(int n1, int n2) {
        suit = getSuit(n1);
        name = getName(n2);
        points = getPoints(name);
    }

    private String getSuit(int n) {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        if (n >= 1 && n <= 4) return suits[n - 1];
        return "Unknown";
    }

    private String getName(int n) {
        String[] names = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        if (n >= 1 && n <= 13) return names[n - 1];
        return "Unknown";
    }

    private int getPoints(String name) {
        switch (name) {
            case "Ace": return 11; // Poin c: Ace dihitung 11 di awal
            case "Jack":
            case "Queen":
            case "King": return 10;
            default: return Integer.parseInt(name);
        }
    }

    public String toString() {
        return name + " of " + suit;
    }
}