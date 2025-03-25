package collectionsReview;

import java.util.ArrayList;
import java.util.List;

public class ShiftArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(1,2,3,4,5,6,7));
        System.out.println(shiftRight(list,3));
    }
    public static ArrayList<Integer> shiftRight(ArrayList<Integer> arr,int shift){
        for (int i = 0 ; i < shift ; i++) {
            arr.remove(0);
        }
        return arr;
    }
}