package whizlabs;

public class ReverseString {


    public static String reverseString(String str) {
        String reverse="";

        for(int i=str.length()-1; i>=0; i--){
            reverse+=str.charAt(i);
        }
        return reverse;

    }

}
