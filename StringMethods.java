public class StringMethods {
    public static void main(String[] args) {
        String name = "John";

        // boolean result = name.equals("JoHn");
        // boolean result = name.equalsIgnoreCase("JoHn");
        // int result = name.length();
        // char result = name.charAt(2);
        // int result = name.indexOf(0);
        // boolean result = name.isEmpty();
        // String result = name.toUpperCase();
        // String result = name.toLowerCase();
        // String result = " Goat ".trim();
        String result = name.replace('h', 'a');

        System.out.println(result);
    }
}
