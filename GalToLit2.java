import java.util.Scanner;

public class GalToLit2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // declare variables
        double gallons = 0;
        double liters = 0;

        System.out.print("Masukkan jumlah galon: ");
        gallons = in.nextDouble();

        // add your calculation here
        liters = gallons * 3.785;

        // output the result to user
        System.out.println(gallons + " gallons equals " + liters + " liters");
    }
}
