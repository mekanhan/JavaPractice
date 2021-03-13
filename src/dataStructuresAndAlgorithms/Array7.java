package dataStructuresAndAlgorithms;

import java.util.ArrayList;
import java.util.Arrays;

public class Array7 {
    public static final <T> void swap (T[] a, int i, int j) {
        T t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
    public static void main(String[] args) {
        int[] a = new int[7];
        a[0]=20;
        a[1]=35;
        a[2]=-15;
        a[3]=7;
        a[4]=55;
        a[5]=1;
        a[6]=-22;

        System.out.println(Arrays.toString(a));
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

    }
}
