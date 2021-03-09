package CodingBat.Arrays;

import java.util.Arrays;

public class ReverseIntArray {
    public int[] swapIntArray(int[] nums) {
        int [] swap = {nums[nums.length-1], nums[nums.length-2], nums[nums.length-3]};
        return swap;

    }

    public static void main(String[] args) {
        ReverseIntArray rot = new ReverseIntArray();
        System.out.println(Arrays.toString(rot.swapIntArray(new int[] {1,2,3})));
        System.out.println(Arrays.toString(rot.swapIntArray(new int[] {2,6,7})));
    }
}
