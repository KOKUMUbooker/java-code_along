package OOP.AccessModifiers.Package_2;

import OOP.AccessModifiers.Package_1.A;

public class D extends A {
    public static void main(String[] args) {
        D d = new D();
        System.out.println(d.protectedMessage);
    }
}
