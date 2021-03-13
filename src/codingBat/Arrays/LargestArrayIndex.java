package codingBat.Arrays;

import java.util.Arrays;

public class LargestArrayIndex {
    public int[] maxEnd3(int[] nums){
        int i;
        int maxNumber = nums[0];
        for (i=1; i<nums.length; i++){
            if (nums[i]>maxNumber)
                maxNumber=nums[i];
        }
        int [] arr = {maxNumber,maxNumber,maxNumber};
        return arr;
    }

    public static void main(String[] args) {
        LargestArrayIndex large = new LargestArrayIndex();
        System.out.println(Arrays.toString(large.maxEnd3(new int[] {2,11,2})));
        System.out.println(Arrays.toString(large.maxEnd3(new int[] {2,11,3})));
        System.out.println(Arrays.toString(large.maxEnd3(new int[] {1,3,5})));
    }
}
