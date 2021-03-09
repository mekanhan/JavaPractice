package CodingBat.Arrays;

import java.util.Arrays;

public class FirstLast6 {
    public boolean firstLast(int [] nums){
//        if (nums[0]==6 || nums[nums.length-1]==6){
//            return true;
//        }
        return nums[0]==6 || nums[nums.length-1]==6;
    }

    public static void main(String[] args) {
        FirstLast6 first = new FirstLast6();

    }
}
