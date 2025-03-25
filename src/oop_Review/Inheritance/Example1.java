package oop_Review.Inheritance;

public class Example1 {
    private static int additionPrivateStatic(int a, int b){ // No need an object class
        return a+b;
    }
    public static int additionPublicStatic(int a, int b){  // No need an object class
        return a+b;
    }
    private int additionPrivate(int a, int b){  // Needs an object class
        return a+b;
    }
    public int additionPublic(int a, int b){    // Needs an object class
        return a+b;
    }
}
