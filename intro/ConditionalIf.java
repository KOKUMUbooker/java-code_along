public class ConditionalIf {
    public static void main(String[] args) {
        int age = 16;

        if (age >= 18 && age < 75) {
            System.out.println("You are an adult!");
        } else if (age >= 75) {
            System.out.println("You're really old");
        } else if (age >= 13 && age < 18) {
            System.out.println("You're a teenager");
        } else {
            System.out.println("You are not an adult!");
        }
    }
}
