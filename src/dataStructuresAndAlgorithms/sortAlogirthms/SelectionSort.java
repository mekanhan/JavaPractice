package dataStructuresAndAlgorithms.sortAlogirthms;

import java.util.Arrays;

public class SelectionSort {
    public int [] bubbleSort (int[] arr){
        for (int lastUnsortedIndex = arr.length-1; lastUnsortedIndex>0; lastUnsortedIndex--){
            // from right to left, decrementing
            int largest = 0;
            for (int i=1; i<=lastUnsortedIndex; i++){
                // from left to right, incrementing
                if (arr[i]>arr[largest]){
                    largest = i;
                }
            }
            swap(arr, largest, lastUnsortedIndex);
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
        SelectionSort b= new SelectionSort();
        System.out.println(Arrays.toString(b.bubbleSort(new int[]{20,-15,7,35,1,-22,55})));
    }
}
