package hashMap;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrList2Dim {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        System.out.println(arr);
        arr.add(new ArrayList<>());
        System.out.println(arr);
        ArrayList<Integer> temp = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        arr.get(0).addAll(temp);
        System.out.println(arr);
        temp.clear();
        temp.addAll(Arrays.asList(7,9,4,3));
        arr.add(new ArrayList<>());
        System.out.println(arr);
        arr.get(1).addAll(temp);
        System.out.println(arr);
    }
}
