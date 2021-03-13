package codingBat.Arrays;

import java.util.Arrays;

public class RotateLeft3 {
    public int[] rotateLeft3(int[] nums) {
        int [] swap = {nums[nums.length-2], nums[nums.length-1], nums[nums.length-3]};
        return swap;
    }
    public static void main(String[] args) {
        RotateLeft3 rot = new RotateLeft3();
        System.out.println(Arrays.toString(rot.rotateLeft3(new int[] {1,2,3})));
        System.out.println(Arrays.toString(rot.rotateLeft3(new int[] {2,6,7})));
    }
}
