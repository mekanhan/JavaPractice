package leetCode;

import java.util.Arrays;

public class ArrRotation {
    public int [] Rotate(int [] a, int k){
        int result [] = new int[a.length];
        int swap [] = new int[a.length];
        for(int i=0; i<a.length; i++){
//            result[(i+k)%a.length] = a[i];        // rotate clockwise by number of k
            result[a.length-1-i] = a[i];            // reverse array
        }
        System.out.println(Arrays.toString(result));
        return result;

    }

    public static void main(String[] args) {
        ArrRotation obj = new ArrRotation();
        obj.Rotate(new int[]{1,2,3,4,5},1);

    }

}
