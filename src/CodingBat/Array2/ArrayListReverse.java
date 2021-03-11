package CodingBat.Array2;

import java.util.*;

public class ArrayListReverse {
    public static void main(String[] args) {
        List<Integer> primes = new ArrayList<Integer>();
        primes.add(2);
        primes.add(3);
        primes.add(5);
        primes.add(7);
        primes.add(11);

        System.out.println(primes);

        Collections.reverse(primes);
        System.out.println(primes);
        for (int i=0; i<primes.size(); i++){
            System.out.println(i);
        }

    }
}
