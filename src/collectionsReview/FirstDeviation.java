package collectionsReview;

import java.util.ArrayList;
import java.util.List;


public class FirstDeviation {
    public static void main(String[] args) {
        int arr[] = {5,8,1,33,6,7,8};
        applyFirstDerivative(arr);

    }
    public static void applyFirstDerivative(int arr[]){
        List<Integer> result = new ArrayList<Integer>();
        for(int i=0 ; i< arr.length-1 ; i++){
            result.add(arr[i]-arr[i+1]);
        }
        System.out.println(result);

    }
}
