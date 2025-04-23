package java_course.section1_dataTypes;

public class Casting_example {

    public static int numbers (int n){ // This method takes an integer n as input and returns an integer.
        // when adding static to the method, it can be called without creating an instance of the class.
        int myIntNumber = n + 1; 
        float myFloatNumber = 12.0f;
        int castedNumber = (int) myFloatNumber; // Explicit casting from float to int
        double myDoubleNumber = 8.00;
        int castedNumber2 = (int) myDoubleNumber; // Explicit casting from double to int
        short myShortNumber = 4;
        int myTotal = myIntNumber + castedNumber + castedNumber2 + myShortNumber;

        return myTotal;
    }


    public static void main(String[] args) {
        System.out.println(numbers(0));
        

    }
}