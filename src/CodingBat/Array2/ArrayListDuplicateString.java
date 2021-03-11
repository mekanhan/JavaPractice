package CodingBat.Array2;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ArrayListDuplicateString {
    public static void main(String[] args) {
        List<String> primes = new ArrayList<String>();
        primes.add("a");
        primes.add("b");
        primes.add("c");
        primes.add("d");  //duplicate
        primes.add("d");
        primes.add("e");

        Set<String> primesWithoutDuplicates = new LinkedHashSet<String>(primes);
        System.out.println(primes);
        primes.clear();
        primes.addAll(primesWithoutDuplicates);
        System.out.println(primes);
    }
}
