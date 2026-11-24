package vehicles;

public class TestVehicle {
    public static void main(String[] args) {
        // Nomor 1.c: Menguji static variable awal
        System.out.println("Manufacturer: " + Vehicle.MAKE);
        System.out.println("Number of vehicles manufactured: " + Vehicle.numVehicles);

        // Nomor 1.f - i: Membuat object vehicle1
        Vehicle vehicle1 = new Vehicle("Vision");
        System.out.println("The vehicle is manufactured by: " + Vehicle.MAKE);
        System.out.println("The model type is " + vehicle1.getModel());
        System.out.println("The chassis number is " + vehicle1.getChassisNo());

        // Nomor 1.j: Membuat object vehicle2
        Vehicle vehicle2 = new Vehicle("Edict");
        System.out.println("The vehicle is manufactured by: " + Vehicle.MAKE);
        System.out.println("The model type is " + vehicle2.getModel());
        System.out.println("The chassis number is " + vehicle2.getChassisNo());

        // Nomor 2.a: Mengubah static variable MAKE menggunakan vehicle2
        vehicle2.setMake("Seer");

        // Nomor 2.b: Menampilkan nilai vehicle1 dan vehicle2 menggunakan toString() setelah diubah
        System.out.println(vehicle1.toString());
        System.out.println(vehicle2.toString());

        // Nomor 4.d: Membuat object Engine (vehicle3)
        Vehicle.Engine vehicle3 = new Vehicle.Engine("Fortune");

        // Nomor 4.e: Menampilkan informasi lengkap termasuk dari inner class Engine
        System.out.println("Vehicle number " + vehicle3.getChassisNo() + 
                           " is a " + vehicle3.getModel() + 
                           " model and has an engine capacity of " + Vehicle.Engine.getCapacity() + "cc");

        // Nomor 1.m & 2.a: Menampilkan total jumlah mobil yang diproduksi di baris akhir
        System.out.println("Number of vehicles manufactured: " + Vehicle.numVehicles);
    }
}