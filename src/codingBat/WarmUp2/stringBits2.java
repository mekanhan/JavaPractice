package codingBat.WarmUp2;

public class stringBits2 {
    boolean Rocket(int [] nums){
        boolean arr = false;
        int end = nums.length;
        for(int i=0; i<end; i++){
            if(nums[i]==9){
                arr = true;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        stringBits2 check = new stringBits2();
        System.out.println(check.Rocket(new int []{1,2,9,9,9}));
        System.out.println(check.Rocket(new int []{1,2,9,0,8}));
        System.out.println(check.Rocket(new int []{1,2,8,0,9}));
    }
}
