package OOP.cars;

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();

        System.out.println(myCar.model);
        System.out.println(myCar.make);

        myCar.drive();
    }
}
