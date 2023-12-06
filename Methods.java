public class Methods {
    public static void main(String[] args) {
        hello("John", 21);
        int sum = add(4, 5);
        System.out.println("Sum : " + sum);
    }

    static void hello(String name, int age) {
        System.out.println("Hello " + name);
        System.out.println("You are " + age);
    }

    static int add(int x, int y) {
        return x + y;
    }
}
