package codingBat.Arrays;

public class Sum2 {
    public int sum2(int[] nums) {
        int sum;
        if(nums.length==1){
            return sum=nums[0];
        }
        else if(nums.length==0){
            return 0;
        }
        return sum = nums[0] + nums[1];
    }

    public static void main(String[] args) {
        Sum2 obj = new Sum2();
        System.out.println(obj.sum2(new int[] {1,2,3}));
        System.out.println(obj.sum2(new int[] {}));

    }
}
