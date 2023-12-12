package OOP.Inheritance;

public class Car extends Vehicle {
    String name;

    Car(String name) {
        this.name = name;
    }

    void move() {
        System.out.println(this.name + " is moving");
    }

    void getDetails() {
        System.out.println(this.name + " is the car's name");
    }
}
