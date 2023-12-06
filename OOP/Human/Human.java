package OOP.Human;

public class Human {
    String name;
    int age;
    double weight;

    Human(String name, int age, double weight) {
        this.name = name;
        this.weight = weight;
        this.age = age;
    }

    void eat(String food) {
        System.out.println(this.name + " is eating " + food);
    }

    void drink(String drink) {
        System.out.println(this.name + " is drinking " + drink);
    }
}
