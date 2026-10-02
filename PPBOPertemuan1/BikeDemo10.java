// PERCOBAAN 1

package PPBOPertemuan1;

public class BikeDemo10 {
    public static void main(String[] args) {
        Bike10 mountainBike1 = new Bike10();
        Bike10 mountainBike2 = new Bike10();
        RoadBike10 roadBike1 = new RoadBike10();

        mountainBike1.setBrand("trek");
        mountainBike1.speedAcceleration(10);
        mountainBike1.gearChanges(2);
        mountainBike1.printInfo();

        mountainBike2.setBrand("Giant");
        mountainBike2.speedAcceleration(20);
        mountainBike2.gearChanges(3);
        mountainBike2.printInfo();

        roadBike1.setBrand("Specialized");
        roadBike1.setTireWidth(25);
        roadBike1.speedAcceleration(15);
        roadBike1.gearChanges(4);
        roadBike1.printInfo();
    }
}
