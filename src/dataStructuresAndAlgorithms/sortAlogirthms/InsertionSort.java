package dataStructuresAndAlgorithms.sortAlogirthms;

import java.util.Arrays;

public class InsertionSort {
    public int [] bubbleSort (int[] arr){
        for (int firstUnsortedIndex = 1; firstUnsortedIndex<arr.length; firstUnsortedIndex++){
            // from right to left, decrementing
            int newElement = arr[firstUnsortedIndex];
            int i;
            for (i=firstUnsortedIndex; i>0 && arr[i-1] > newElement; i--){
                // from right to left
                arr[i] = arr[i-1];
            }
            arr[i] = newElement;
        }
        return arr;
    }


    public static void main(String[] args) {
        InsertionSort b= new InsertionSort();
        System.out.println(Arrays.toString(b.bubbleSort(new int[]{20,-15,7,35,1,-22,55})));
    }
}
