package exceptions;

import java.util.Arrays;

public class MatrixTranspose2 {
    public static void main(String[] args) {
        int [][] arr={ {1,2,3,4}, {4,5,6}, {7,8} };
        for(int [] row:arr){
            System.out.println(Arrays.toString(row)); // Prints in a row (1st # of each bracket...
        }
        System.out.println(Arrays.toString(arr)); //to show how Arrays.toString() works
        try {
            for (int i = 0; i < arr.length; i++) {  //Prints rows in line
                for (int j = 0; j < arr.length; j++) {
                    System.out.print(arr[j][i] + "\t");
                }
            }
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(" ");                //in between index
                                                     //Prints up to here
        }
        finally {
            System.out.println("Hello World");
        }


        for (int i=0; i<arr.length; i++){       //Prints rows separately
            for (int j=0; j<arr[0].length; j++){
                try {
                    System.out.println(arr[j][i]+"\t");
                }
                catch (ArrayIndexOutOfBoundsException e){
                    System.out.println("oops");     //Prints after each row
                }
            }
        }
    }



}
