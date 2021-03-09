package CodingBat.Arrays;

public class sameFirstLast {
    public boolean sameFirstLast(int[] nums) {
        return nums.length>=1 & nums[0]==nums[nums.length-1];

    }

    public static void main(String[] args) {
        sameFirstLast same = new sameFirstLast();
    }

}
