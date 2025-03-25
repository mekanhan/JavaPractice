package oop_Review;

public class ShapeCalc {
    public static void calculatePerimeter(int edge1, int edge2, int edge3){
        System.out.println("Perimeter of Triangle is " + (edge1+edge2+edge3));
    }
    public static void calculatePerimeter(int edge){
        System.out.println("Perimeter of Square is " + (4*edge));
    }
    public static void calculatePerimeter(double radius){
        System.out.println("Perimeter of Circle is " + 2*3.1416*radius);
    }
    public void calculateArea(int a, int b){
        System.out.println("Area of Rectangle is " + (a*b));
    }
    public void calculateArea(int edge){
        System.out.println("Area of Square is " + (edge*edge));
    }
    public void calculateArea(double radius){
        System.out.println("Area of Circle is " + (3.14*radius*radius));
    }
}
