public class PrintFMethod {
    public static void main(String[] args) {
        System.out.printf("This is a format string %d \n", 123);
        // % [flags] [precision] [width] [conversion-character]

        int myInt = 12;
        char myChar = '@';
        double myDouble = 21.43;
        String myString = "Hello";
        boolean myBoolean = true;

        // [conversion-character]
        // System.out.printf("%d", myInt);
        // System.out.printf("%c", myChar);
        // System.out.printf("%s", myString);
        // System.out.printf("%f", myDouble);
        // System.out.printf("%b", myBoolean);

        // [width]
        System.out.printf("Hello %5s \n", "Booker");

        // [precision]
        System.out.printf("Double value (2decimal places) : %.2f \n", 3.142);

        // [flags]
        // - : left justify
        // + : output + or - for a numeric value
        // 0 : numeric values are zero padded
        // , : comma grouping if number > 1000
        System.out.printf("You have %,d in your account \n", 150100);
    }
}
