package CodingBat;

import java.util.Random;

/*
Given 2 int values, return true if one is negative and one is positive.
Except if the parameter "negative" is true, then return true only if both are negative.

posNeg(1, -1, false) → true
posNeg(-1, 1, false) → true
posNeg(-4, -5, true) → true
 */

public class
PositiveNegative {

    public static boolean posNeg(int a, int b, boolean negative) {
        if(a<0 && b>0 && negative!=true || b<0 && a>0 && negative!=true ){
            return true;
        }
        else if (negative==true && b<0 && a<0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Random rand = new Random();
        int rand_int1 = rand.nextInt(1);
        int rand_int2 = rand.nextInt(20);
        boolean rand_bool = rand.nextBoolean();
        System.out.println("int1: " + rand_int1 + " int2: " + rand_int2 + " boolean: " + rand_bool);
        System.out.println(posNeg(rand_int1,rand_int2,rand_bool));
    }

}