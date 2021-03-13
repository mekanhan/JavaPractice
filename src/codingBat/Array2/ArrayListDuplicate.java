package codingBat.Array2;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ArrayListDuplicate {
    public static void main(String[] args) {
        List<Integer> primes = new ArrayList<Integer>();
        primes.add(2);
        primes.add(3);
        primes.add(5);
        primes.add(7);  //duplicate
        primes.add(7);
        primes.add(11);

        Set<Integer> primesWithoutDuplicates = new LinkedHashSet<Integer>(primes);
        System.out.println(primes);
        primes.clear();
        primes.addAll(primesWithoutDuplicates);
        System.out.println(primes);
    }
}
