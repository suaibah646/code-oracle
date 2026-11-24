


public class Fish {
    String typeOffish;
    int friendliness;

    // Default Constructor
    public Fish() {
        this.typeOffish = "Unknown";
        this.friendliness = 3;
    }

    // Constructor dengan parameter
    public Fish(String t, int f) {
        this.typeOffish = t;
        this.friendliness = f;
    }

    // Method untuk mendapatkan tingkat keramahtamahan (Nomor 5)
    public int getFriendliness() {
        return friendliness;
    }

    // Method nicestFish untuk membandingkan 2 ikan (Nomor 7)
    public static Fish nicestFish(Fish fish1, Fish fish2) {
        if (fish1.getFriendliness() >= fish2.getFriendliness()) {
            return fish1;
        } else {
            return fish2;
        }
    }
}