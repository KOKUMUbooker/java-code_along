import java.util.ArrayList;

public class TwoDArrayList {
    public static void main(String[] args) {
        ArrayList<String> bakeryList = new ArrayList<String>();
        bakeryList.add("Bread");
        bakeryList.add("Cereals");
        bakeryList.add("Donuts");

        ArrayList<String> produceList = new ArrayList<String>();
        produceList.add("Tomatoes");
        produceList.add("Garlic");
        produceList.add("Peppers");

        ArrayList<String> drinksList = new ArrayList<String>();
        drinksList.add("Soda");
        drinksList.add("Coffee");

        ArrayList<ArrayList<String>> groceryList = new ArrayList<ArrayList<String>>();
        groceryList.add(bakeryList);
        groceryList.add(produceList);
        groceryList.add(drinksList);

        System.out.println(groceryList);
        System.out.println("produceList : " + groceryList.get(2));

    }
}
