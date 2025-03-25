package oop_Review;

public class MethodOverload {
    public int sum(int a, int b){
        return a+b;
    }
    public int sum(int a, int b, int c){
        return a+b+c;
    }
    public double sum(double x, double y){
        return x+y;
    }

    public static void main(String[] args) {
        MethodOverload object = new MethodOverload();
        System.out.println(object.sum(11,89));
        System.out.println(object.sum(8.12, 34.07));
        System.out.println(object.sum(1, 2, 3));
    }
}
