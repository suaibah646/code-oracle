

public class MainFish {
    public static void main(String[] args) {
        // Nomor 6: Menginisialisasi 2 ikan baru
        // a. Ikan 1: Nama - Amber, Jenis - AngelFish, Tingkat Keramahan - 5
        Fish ikan1 = new Fish("AngelFish", 5);
        
        // b. Ikan 2: Nama - James, Jenis - Guppy, Tingkat Keramahan - 3
        Fish ikan2 = new Fish("Guppy", 3);

        // Nomor 7 & 9: Menguji method nicestFish dengan 2 ikan
        // (Catatan: Jika method nicestFish ditaruh di dalam Fish.java, pemanggilannya bisa seperti di bawah)
        Fish ikanPalingRamah = Fish.nicestFish(ikan1, ikan2);

        System.out.println("=== Pengujian Perbandingan Ikan ===");
        System.out.println("Ikan 1 -> Jenis: " + ikan1.typeOffish + ", Keramahan: " + ikan1.getFriendliness());
        System.out.println("Ikan 2 -> Jenis: " + ikan2.typeOffish + ", Keramahan: " + ikan2.getFriendliness());
        System.out.println("\nIkan yang paling ramah adalah jenis: " + ikanPalingRamah.typeOffish 
                           + " dengan tingkat keramahan " + ikanPalingRamah.getFriendliness());
    }
}
