import java.util.ArrayList;

public class ArrayListSample {
    public static void main(String[] args) {
        // ArrayList = a resizeable array
        // Elements can be added and removed after compilation phase

        ArrayList<String> food = new ArrayList<String>();
        food.add("Chicken");
        food.add("Fish");
        food.add("Eggs");

        food.set(1, "Githeri");
        food.remove(2);
        // food.clear();

        for (int i = 0; i < food.size(); i++) {
            System.out.println(food.get(i));
        }
    }
}
