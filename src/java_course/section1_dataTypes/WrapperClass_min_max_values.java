package java_course.section1_dataTypes;

public class WrapperClass_min_max_values {
    public static void main(String[] args) {
        System.out.println("Integer.MIN_VALUE " + Integer.MIN_VALUE);  // Minimum value of an int in Java wrapper class -2_147_483_648
        System.out.println("Integer.MAX_VALUE " + Integer.MAX_VALUE);  // Maximum value of an int in Java wrapper class 2_147_483_648
        System.out.println(Integer.SIZE); // Number of bytes used to represent an int in Java wrapper class 4

        // over flow and underflow examples
        // Note: The following lines will cause an overflow and underflow, respectively.
        System.out.println(Integer.MAX_VALUE + 1); // This will cause an overflow and wrap around to Integer.MIN_VALUE
        System.out.println(Integer.MIN_VALUE - 1); // This will cause an underflow and wrap around to Integer.MAX_VALUE

        System.out.println(Byte.MIN_VALUE);  // Minimum value of a byte in Java wrapper class -128
        System.out.println(Byte.MAX_VALUE);  // Maximum value of a byte in Java wrapper class 127
        System.out.println(Byte.SIZE); // Number of bytes used to represent a byte in Java wrapper class 1

        System.out.println(Float.MIN_VALUE);  // Minimum value of a float in Java wrapper class 1.4E-45
        System.out.println(Float.MAX_VALUE);  // Maximum value of a float in Java wrapper class 3.4028235E38
        System.out.println(Float.SIZE); // Number of bytes used to represent a float in Java wrapper class 4

        System.out.println(Double.MIN_VALUE);  // Minimum value of a double in Java wrapper class 4.9E-324
        System.out.println(Double.MAX_VALUE);  // Maximum value of a double in Java wrapper class 1.7976931348623157E308
        System.out.println(Double.SIZE); // Number of bytes used to represent a double in Java wrapper class 8

        System.out.println(Short.MIN_VALUE);  // Minimum value of a short in Java wrapper class -32_768
        System.out.println(Short.MAX_VALUE);  // Maximum value of a short in Java wrapper class 32_767
        System.out.println(Short.SIZE); // Number of bytes used to represent a short in Java wrapper class 2

        System.out.println(Long.MIN_VALUE);  // Minimum value of a long in Java wrapper class -9_223_372_036_854_775_808
        System.out.println(Long.MAX_VALUE);  // Maximum value of a long in Java wrapper class 9_223_372_036_854_775_807
        System.out.println("Long.SIZE " + Long.SIZE);  // Number of bytes used to represent a long in Java wrapper class 8
    }
    
}
