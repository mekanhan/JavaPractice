package hackerRank;
//https://www.hackerrank.com/challenges/sock-merchant/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup

import java.util.Arrays;

public class SalesByMatch {
    public int socksPair(int[] ar){
        int countEven=0;
        int countOdd=0;
//        for(int i=0; i<ar.length; i++){
//            for(int j=i+1; j<ar.length; j++){
//                if (ar[i]==(ar[j])){
//                    countEven++;
//                }
//            }
//        }

        for (int i=0; i<ar.length; i++){
            if (ar[i]==10){
                countOdd++;
            }
            if (ar[i]==20){
                countEven++;
            }
        }
        return (countEven+countOdd)/2;
    }

    public static void main(String[] args) {
        SalesByMatch s = new SalesByMatch();
        System.out.println(s.socksPair(new int[]{10,20,10,20,10,20,20}));
    }

}
