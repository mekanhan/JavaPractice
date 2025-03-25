package oop_Review.Inheritance;

public class ABCTest {
    public static void main(String[] args) {
        A obj1 = new A();
        System.out.println(obj1.getA());
        B obj2 = new B();
        System.out.println(obj2.getA());
        C obj3 = new C();
        System.out.println(obj3.getA());
        obj2.setA(40);
        obj3.setA(60);
        System.out.println(obj1.getA());
        System.out.println(obj2.getA());
        System.out.println(obj3.getA());
    }
}
