

public class MainShape {
    public static void main(String[] args) {
        // Membuat objek Shape menggunakan default constructor
        Shape shape1 = new Shape();
        System.out.println("Jumlah sisi (default): " + shape1.getNumSides());
        System.out.println("Apakah beraturan (default): " + shape1.isRegular());

        // Membuat objek Shape menggunakan constructor berparameter
        Shape shape2 = new Shape(3, false);
        System.out.println("Jumlah sisi (custom): " + shape2.getNumSides());
        System.out.println("Apakah beraturan (custom): " + shape2.isRegular());
    }
}
