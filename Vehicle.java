package vehicles;

public class Vehicle {
    // Nomor 1: Static variables
    public static String MAKE = "Augur";
    public static int numVehicles = 0;

    // Nomor 1: Instance variables
    private String chassisNo;
    private String model;

    // Nomor 1: Constructor
    public Vehicle(String model) {
        numVehicles++;
        this.chassisNo = "ch" + numVehicles;
        this.model = model;
        System.out.println("Vehicle manufactured");
    }

    // Nomor 1: Getter dan Setter untuk instance variables
    public String getChassisNo() {
        return chassisNo;
    }

    public void setChassisNo(String chassisNo) {
        this.chassisNo = chassisNo;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    // Nomor 2: Setter untuk mengubah static variable MAKE
    public static void setMake(String newMake) {
        MAKE = newMake;
    }

    // Nomor 3 & 4: Nested Static Class "Engine" (mewarisi Vehicle untuk nomor 4)
    public static class Engine extends Vehicle {
        private static final String MAKE = "Predicter";
        private static final int CAPACITY = 1600;

        // Constructor Engine yang memanggil super constructor (Nomor 4.b - 4.c)
        public Engine(String model) {
            super(model);
        }

        // Getter static untuk MAKE dan CAPACITY (Nomor 3.f)
        public static String getEngineMake() {
            return MAKE;
        }

        public static int getCapacity() {
            return CAPACITY;
        }
    }

    // Nomor 1.k: Method toString()
    @Override
    public String toString() {
        return "The vehicle is manufactured by: " + MAKE + "\n" +
               "The model type is " + model + "\n" +
               "The chassis number is " + chassisNo;
    }
}