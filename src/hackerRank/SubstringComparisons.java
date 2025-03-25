package hackerrank;

public class SubstringComparisons {
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "something";
        String largest = "something";
        smallest = largest = s.substring(0, k);

        for (int i=1; i<s.length()-k+1; i++) {
            String substr = s.substring(i, i+k);
            if (smallest.compareTo(substr) > 0)
                smallest = substr;
            if (largest.compareTo(substr) < 0)
                largest = substr;
        }
        System.out.println(smallest + " " + largest);
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        SubstringComparisons obj = new SubstringComparisons();
        obj.getSmallestAndLargest("welcome",3);
    }
}
