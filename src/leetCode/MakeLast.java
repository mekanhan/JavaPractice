package leetCode;

import java.util.Arrays;

public class MakeLast {
    public int[] makeLast(int[] nums) {
        int arr [] = new int[2*nums.length];
        System.out.println(arr.length);
        arr[2*nums.length-1]= nums[nums.length-1];
        System.out.println(Arrays.toString(arr));
        return arr;

    }

    public static void main(String[] args) {
        MakeLast obj = new MakeLast();
        obj.makeLast(new int[]{1, 2, 3, 4});
    }
}
