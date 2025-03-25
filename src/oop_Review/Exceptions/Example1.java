package oop_Review.Exceptions;

public class Example1 {
    public static void main(String[] args) {
        int x=10;
        int y=0;
        try{
            System.out.println(x/y);
        }
        catch (Exception e){    //e - "exception like convention" class
        }
        System.out.println("can you see me?");
    }
}
