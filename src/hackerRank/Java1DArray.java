package hackerRank;

import java.util.Arrays;
import java.util.Scanner;

public class Java1DArray {
    public static int[] Arr(int[] n){
        int[] a = new int[n.length];
        for (int i=0; i<n.length; i++) {
            a[i]=n[i];
        }

        return a;
    }

    public static void main (String args[]){
        Java1DArray j = new Java1DArray();
        System.out.println(Arrays.toString(j.Arr(new int[]{5,10,20,30,40,50})));

//        or
//        Scanner scan = new Scanner(System.in);
//        int n = scan.nextInt();
//        int[] a = new int[n];
//        for(int i = 0; i < n; i++){
//            a[i]=scan.nextInt();
//        }
//        scan.close();
//        // Prints each sequential element in array a
//        for (int i = 0; i < a.length; i++) {
//            System.out.println(a[i]);
//        }
    }
}







