package amazonPrep;

import java.util.Arrays;
import java.util.List;

public class Manipulating2DArray {
    
    public static int hourglassSum(List<List<Integer>> arr) {
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {
                int top =arr.get(i).get(j) +arr.get(i).get(j + 1) +arr.get(i).get(j + 2);
                int mid =arr.get(i + 1).get(j + 1);
                int bottom =arr.get(i + 2).get(j) +arr.get(i + 2).get(j + 1) +arr.get(i + 2).get(j + 2);

                int tempSum = top + mid + bottom;
                maxSum = Math.max(maxSum, tempSum);
                
            }
        }

        return maxSum;
    }


    public static void main(String[] args) {
        List<List<Integer>> arr = Arrays.asList(
            Arrays.asList(1, 1, 1, 0, 0, 0),
            Arrays.asList(0, 1, 0, 0, 0, 0),
            Arrays.asList(1, 1, 1, 0, 0, 0),
            Arrays.asList(0, 0, 2, 4, 4, 0),
            Arrays.asList(0, 0, 0, 2, 0, 0),
            Arrays.asList(0, 0, 1, 2, 4, 0)
        );

        System.out.println(hourglassSum(arr));
        // int maxValue = hourglassSum(arr);
        // System.out.println(maxValue);
    }
}
