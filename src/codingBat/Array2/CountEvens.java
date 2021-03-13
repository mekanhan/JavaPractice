package codingBat.Array2;

public class CountEvens {
    public int countEvents(int[] nums){
        int even=0;
        for (int i=0; i<nums.length; i++){
            if (i%2==0){
             even++;
            }
        }
        return even;
    }

    public static void main(String[] args) {
        CountEvens c= new CountEvens();
        System.out.println(c.countEvents(new int[]{5,2,3,4}));
    }
}
