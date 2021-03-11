package leetCode;

import java.util.Arrays;

public class SumOf1D {
    public int[] runningSum(int[] nums){
        int sum=0;
        for (int i=0; i<nums.length; i++){
            sum +=nums[i];  //accumulates values
            nums[i]=sum;   //nums = accumulated values
        }
        return nums;
    }

    public static void main(String[] args) {
        SumOf1D s = new SumOf1D();
        System.out.println(Arrays.toString(s.runningSum(new int[] {1,2,3,4,5})));
    }
}
