package leetCode;

public class Sum67 {
    public int sum67(int[] nums) {
        int sum = 0;
        int result = 0;
        for(int i=nums.length-1; i>0; i--){
            if(nums[i]==7){
                break;
            }
            sum+=nums[i];
        }
        for(int i=0; i<nums.length; i++){
            if(nums[i]==6){
                break;
            }
            result += nums[i];
        }
        System.out.println(sum + result);
        return sum+result;
    }
    public static void main(String[] args) {
        Sum67 obj = new Sum67();
        obj.sum67(new int[]{5,5,5,6,10,10,7,5});
        obj.sum67(new int[]{10,20,10,6,50,7,50,50});
    }
}
