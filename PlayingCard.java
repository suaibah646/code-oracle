

public class PlayingCard {
    int suitNumber;
    int faceNumber;
    String name;
    String suit;
    int points;

    // Constructor untuk menginisialisasi kartu berdasarkan nomor suit dan face
    public PlayingCard(int suitNum, int faceNum) {
        this.suitNumber = suitNum;
        this.faceNumber = faceNum;
        
        // Menentukan nama kartu (Ace, 2-10, Jack, Queen, King)
        switch (faceNum) {
            case 1: name = "Ace"; points = 1; break;
            case 11: name = "Jack"; points = 10; break;
            case 12: name = "Queen"; points = 10; break;
            case 13: name = "King"; points = 10; break;
            default: name = String.valueOf(faceNum); points = faceNum; break;
        }

        // Menentukan jenis simbol kartu (suit)
        switch (suitNum) {
            case 1: suit = "Hearts"; break;
            case 2: suit = "Diamonds"; break;
            case 3: suit = "Clubs"; break;
            case 4: suit = "Spades"; break;
            default: suit = "Unknown"; break;
        }
    }

    // Method untuk menampilkan representasi teks kartu
    public String toString() {
        return "The " + name + " of " + suit;
    }

    public int getPoints() {
        return points;
    }

    public String getName() {
        return name;
    }

    public String getSuit() {
        return suit;
    }
}
