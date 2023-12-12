package OOP.Encapsulation;

public class Main {

    public static void main(String[] args) {
        Car car1 = new Car("Nissan", "GTR", 2009);

        System.out.println(car1.getModel());

        car1.setModel("GTR Nismo");
        System.out.println(car1.getModel());

    }
}
