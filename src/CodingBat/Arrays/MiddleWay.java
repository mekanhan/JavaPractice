package CodingBat.Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MiddleWay {
    public int [] middleWay(int[] a, int[] b){
        int[] arr = {a[a.length/2], b[b.length/2]};
        return arr;
    }

    public static void main(String[] args) {
        MiddleWay mid = new MiddleWay();
        System.out.println(Arrays.toString(mid.middleWay(new int[] {1,2,3}, new int[] {4,5,6})));
    }
}
