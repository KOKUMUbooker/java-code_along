package OOP.Encapsulation;

public class Main {

    public static void main(String[] args) {
        Car car1 = new Car("Nissan GTR", "R34", 2009);
        Car car2 = new Car("Toyota Supra", "MK4", 2005);
        Car car3 = new Car("BMW", "M3", 2007);

        // copies car1 details into car2 while retaining its own different memory
        // location
        car2.copy(car1);

        // OR
        // By creating a new car object with details of another car AKA using overridden
        // constructor
        Car car4 = new Car(car3);
    }
}
