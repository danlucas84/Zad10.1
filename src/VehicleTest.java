import javax.xml.catalog.Catalog;

public class VehicleTest {

    public VehicleTest() {
    }

    public static void main(String[] args) {

        Vehicle[] vehicles = new Vehicle[2];

        vehicles[0] = new Car("Polonez", 50, 10, false);

        vehicles[1] = new Truck("Volvo", 100, 20, false);
    }
}
