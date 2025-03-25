package exceptions;

import java.util.Arrays;

public class MatrixTranspose {
    public static void main(String[] args) {
        int [][] arr={ {1,2,3,4}, {4,5,6}, {7,8} };
        for(int [] row:arr){
            System.out.println(Arrays.toString(row));
        }
        System.out.println(Arrays.toString(arr)); //to show how Arrays.toString() works

        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr.length; j++){
                try {
                    System.out.print(arr[j][i]+"\t");
                }
                catch (ArrayIndexOutOfBoundsException e){
                    System.out.println(" ");
                }
                finally {
                    System.out.print("oops2");
                }
            }
            System.out.println();
        }
    }
}
