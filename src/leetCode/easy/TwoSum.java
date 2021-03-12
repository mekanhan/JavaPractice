package leetCode.easy;

import java.util.Arrays;

public class TwoSum {
    public int[] twoSum(int[] nums, int target){
        //O(N^2) Time complexity
       for (int i=0; i<nums.length; i++){
           for (int j=i+1; j<nums.length; j++){
               if (nums[i]+nums[j]==target){
                   return new int[]{i,j};
               }
           }
       }
       return new int[]{};
    }
    public static void main (String args[]){
        TwoSum two= new TwoSum();
        System.out.println(Arrays.toString(two.twoSum(new int[]{1,2,3,4,5},9)));
    }
}
