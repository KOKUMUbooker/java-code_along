package OOP.OverloadedConstructors;

public class Main {
    public static void main(String[] args) {

        Pizza pizza = new Pizza("Thick crust", "tomato", "mozzorella", "pepperoni");

        System.out.println("Here are the ingredients of your pizza : ");
        System.out.println(pizza.bread);
        System.out.println(pizza.cheese);
        System.out.println(pizza.sauce);
        System.out.println(pizza.topping);
    }
}
