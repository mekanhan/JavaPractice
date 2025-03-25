package leetCode;

import java.util.Arrays;

public class FindMaxMinSecondMax {
    public int Find(int [] arr){
        int result = 0;
        int largest = 0;
        int smallest = 0;
        int secondLargest = 0;
        int temp = 0;
        for(int i=0; i<arr.length; i++){
            for (int j=i+1; j<arr.length; j++){
                if(arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        largest = arr[arr.length-1];
        secondLargest = arr[arr.length-2];
        smallest = arr[0];
        System.out.println(Arrays.toString(arr));
        System.out.println(largest +" "+ secondLargest +" "+ smallest);

        return result;
    }
    public int difference(int [] nums){
        int largest = nums[0];
        int smallest = nums[0];
        int large = 0;
        int secondLargest=0;
        int result =0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]>largest){
                largest=nums[i];
            }
            if(nums[i]<smallest){
                smallest=nums[i];
            }
            //secondLargest
            if(nums[i]>large){
                secondLargest = large;
                large=nums[i];
            }
            else if(nums[i]>secondLargest && secondLargest!=large){
                secondLargest = nums[i];
            }
        }
        result = largest-smallest;
        System.out.println(secondLargest);
        System.out.println(result);
        return result;
    }
    public static void main(String[] args) {
        FindMaxMinSecondMax obj = new FindMaxMinSecondMax();
//        obj.Find(new int[]{1, 2, 30, 15, 25});
        obj.difference(new int[]{10,25,26,24,39});
    }
}
