import java.util.Scanner;

public class BasicMath {
    public static void main(String[] args) {
        // double x = 3.14;
        // double y = 10;

        // // double z = Math.min(x, y);
        // // double z = Math.sqrt(y);
        // double z = Math.floor(x);

        // System.out.println(z);

        // Program that calculates hypotenuse after obtaining height and width from user
        double a;
        double b;
        double c;

        Scanner scanner = new Scanner(System.in);
        System.out.println("***************** Program to calculate hypotenuse of a triangle *******************");
        System.out.println("Enter the following dimensions : ");
        System.out.print("Base : ");
        a = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Height : ");
        b = scanner.nextDouble();
        scanner.nextLine();

        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        System.out.println("The hypotenuse of the triangle is : " + c);

        scanner.close();

    }
}
