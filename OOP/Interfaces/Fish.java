package OOP.Interfaces;

public class Fish implements Predator, Prey {
    public void hunt() {
        System.out.println("This fish is hunting smaller fish");
    }

    public void flee() {
        System.out.println("This fish is fleeing larger fish");
    }

}
