package dataStructures;

import java.util.Arrays;

public class ArrayBubbleSort {
    public static void main(String[] args) {
        int intArray[] = {20,35,-15,7,55,1,-22};

        for(int i=0; i< intArray.length-1; i++){
            for(int j=0; j< intArray.length-1; j++){
                if(intArray[j] > intArray[j+1]){
                    swap(intArray, j, j+1);
                }
            }
        }
        System.out.println(Arrays.toString(intArray));
    }
    public static void swap (int array[], int a, int b){
        if(a == b)
            return;
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}
