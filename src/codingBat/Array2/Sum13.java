package codingBat.Array2;

public class Sum13 {
    public int sum13(int[] nums) {
        int sum=0;

        for(int i=0; i<nums.length; i++){
            if(nums[i]!=13){
                sum +=nums[i];
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        Sum13 s = new Sum13();
        System.out.println(s);
    }
}
