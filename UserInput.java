import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name? ");
        String name = scanner.nextLine();

        System.out.println("How old are you? ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Work around to clear /n character so that it doesn't interfere with reading
                            // the next user input since nextInt() does not read will only read the integer
                            // and not the \n and the next use of the scanner which uses nextLine() will
                            // assume user already entered a value and thus not wait for user input

        System.out.println("What is your favorite food? ");
        String food = scanner.nextLine();

        System.out.println("*****************************");
        System.out.println("Hello " + name);
        System.out.println("You are " + age + " years old");
        System.out.println("You like  " + food);
    }
}
