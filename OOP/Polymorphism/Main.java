package OOP.Polymorphism;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Boat boat = new Boat();
        Bike bike = new Bike();

        Vehicle[] vehicles = { car, boat, bike };

        for (Vehicle v : vehicles) {
            v.go();
        }
    }
}
