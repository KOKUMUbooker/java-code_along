package OOP.Inheritance;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Car car1 = new Car("Nissan GTR");

        car1.getDetails();
        // Method overriding
        car1.move();
    }
}