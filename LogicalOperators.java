import java.util.Scanner;

public class LogicalOperators {
    public static void main(String[] args) {
        // *********** i) AND - && *****************/
        // int temp = 30;

        // if (temp > 30) {
        // System.out.println("It is hot outside");
        // } else if (temp >= 20 && temp <= 30) {
        // System.out.println("It is warm outside");
        // } else {
        // System.out.println("Its cold outside");
        // }

        // *********** ii) OR - || *****************/
        // Scanner scanner = new Scanner(System.in);
        // System.out.println("You are playing a game! Press q or Q to quit");
        // String response = scanner.nextLine();
        // if (response.equals("q") || response.equals("Q")) {
        // System.out.println("You quit the game");
        // } else {
        // System.out.println("You are still playing the game *pew pew*");
        // }

        // *********** iii) NOT - ! *****************/
        Scanner scanner = new Scanner(System.in);
        System.out.println("You are playing a game! Press q or Q to quit");
        String response = scanner.nextLine();
        if (!response.equals("q") || !response.equals("Q")) {
            System.out.println("You are still playing the game *pew pew*");
        } else {
            System.out.println("You quit the game");
        }
    }
}
