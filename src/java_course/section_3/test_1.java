package java_course.section_3;

public class test_1 {

    public static int numbers (int n){ // This method takes an integer n as input and returns an integer.
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