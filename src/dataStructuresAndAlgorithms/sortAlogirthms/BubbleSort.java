package dataStructuresAndAlgorithms.sortAlogirthms;

import java.util.Arrays;

public class BubbleSort {
    public int [] bubbleSort (int[] arr){
        for (int lastUnsortedIndex = arr.length-1; lastUnsortedIndex>0; lastUnsortedIndex--){
            // from right to left, decrementing
            for (int i=0; i<lastUnsortedIndex; i++){
                // from left to right, incrementing
                if (arr[i]>arr[i+1]){
                    swap(arr, i, i+1);
                }
            }
        }
        return arr;
    }
    public static void swap (int[] array, int i, int j){
        if (i==j){
            return;
        }
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        BubbleSort b= new  BubbleSort();
        System.out.println(Arrays.toString(b.bubbleSort(new int[]{20,-15,7,35,1,-22,55})));
    }
}
