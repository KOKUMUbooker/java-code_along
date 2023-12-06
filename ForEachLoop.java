import java.util.ArrayList;

public class ForEachLoop {
    public static void main(String[] args) {
        // String[] animals = { "Cat", "Dogs", "Rats" };
        ArrayList<String> animals = new ArrayList<String>();

        animals.add("Cat");
        animals.add("Dogs");
        animals.add("Rats");

        for (String i : animals) {
            System.out.println(i);
        }
    }
}
