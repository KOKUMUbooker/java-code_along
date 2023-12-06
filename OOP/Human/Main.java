package OOP.Human;

public class Main {
    public static void main(String[] args) {
        Human human1 = new Human("Rick", 50, 70.5);
        Human human2 = new Human("Morty", 16, 40);

        // System.out.println("human 1" + human1.name);
        // System.out.println("human 2" + human2.name);

        human2.eat("Chicken");
        human1.drink("soda");
    }

}
