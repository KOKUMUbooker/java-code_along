public class ArraysInJava {
    public static void main(String[] args) {
        // Array initialization approach 1 :
        // String[] cars = { "Audi", "Nissan GTR", "Honda", "Toyota Supra" };
        // cars[0] = "BMW";
        // System.out.println(cars[1]);

        // Array initialization approach 2 :
        String[] cars = new String[3];
        // cars[0] = "BMW";
        // cars[1] = "Nissan GTR";
        // cars[2] = "Toyota Supra";
        // System.out.println(cars[2]);

        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }
    }
}
