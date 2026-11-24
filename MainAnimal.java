

public class MainAnimal {
    public static void main(String[] args) {
        // Membuat instance pertama menggunakan default constructor
        Animal animal1 = new Animal();

        // Membuat instance kedua menggunakan constructor berparameter
        Animal animal2 = new Animal(60, 5, 4);

        // Mencetak hasil kecepatan menggunakan method getSpeed()
        System.out.println("a. Animal #1 memiliki kecepatan " + animal1.getSpeed() + ".");
        System.out.println("b. Animal #2 memiliki kecepatan " + animal2.getSpeed() + ".");
    }
}
