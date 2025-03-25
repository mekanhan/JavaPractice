package leetCode;

public class Has22 {
    public boolean has22(int[] nums, int k) {
        boolean found = false;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==k && i>0 && nums[i-1]==k){
                found = true;
            }
            if(nums[i]==k && i<nums.length-1 && nums[i+1]==k){
                found = true;
            }
        }
        System.out.println(found);
        return found;
    }

    public static void main(String[] args) {
        Has22 obj = new Has22();
        obj.has22(new int[]{1,2,2,36,5}, 2);
    }
}
