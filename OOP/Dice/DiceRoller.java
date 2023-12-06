package OOP.Dice;

import java.util.Random;

public class DiceRoller {
    // Local and global variables
    Random random;
    int number;

    DiceRoller() {
        random = new Random();
        roll();
    }

    void roll() {
        number = random.nextInt(6) + 1;
        System.out.println(number);
    }
}
