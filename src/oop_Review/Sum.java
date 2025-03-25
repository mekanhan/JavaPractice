package oop_Review;

public class Sum {
    public int addition(int a, int b){
        return a+b;
    }
    public static int sum(int x, int y){
        return x+y;
    }

    public static void main(String[] args) {
        Sum add = new Sum();
        System.out.println(add.addition(34,66));
        System.out.println(Sum.sum(11,34));
    }
}
