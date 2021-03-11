package CodingBat.Array2;

public class BigDiff {
    public int bigDiff(int[] nums){
        int max=nums[0];
        int min=nums[0];
        for(int i=0; i<nums.length; i++){
            max=Math.max(max,nums[i]);
            min=Math.min(min,nums[i]);
        }
        return max-min;
    }

    public static void main(String[] args) {
        BigDiff b = new BigDiff();
        System.out.println(b.bigDiff(new int[]{1,2,6,3,4,5}));
    }

}
