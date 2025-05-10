package amazonPrep.ch_1_arraysAndStrings;

import java.util.ArrayList;
import java.util.HashSet;

public class StringWords {

    // merging strings from ArrayList to a string
    public static ArrayList<String> merge(String[] words, String[] more){
        ArrayList<String> sentence = new ArrayList<String>();
        for(String w : words){
            sentence.add(w);
        }
        for(String w : more){
            sentence.add(w);
        }
        return sentence;
    }

    public static String joinWords(String [] words){
        String sentence = "";
        for(String w: words){
            sentence = sentence + " " + w;
        }
        return sentence;

        //O(xn^2) because 1 + 2 ... + n equals n(n+1).2 or O(n^2);
    }

    public static String joinWords2(String [] words){
        StringBuilder sentence = new StringBuilder();
        for(String w: words){
            sentence.append(w);
        }
        return sentence.toString();

        //StringBuilder avoids O(n^2) by creating resizable array strings, copying them back to a string only when necessary
    }

    /*
     * 1.1 Is Unique: Determine if a string has all unique characters?
     * 
     */

    // HashSet is most efficient solution
    public static boolean isUniqueCharacterHashSet(String input){
        HashSet<Character> myStr = new HashSet<>();
        for(int i=0; i<input.length(); i++){
            if(myStr.contains(input.charAt(i))){
                return false;
            }
            myStr.add(input.charAt(i));
            System.out.println("Added " + myStr);
        }
        return true;
    }

    /* Same problem but solve without data structures, less efficient, O(n^2)
     Use nested loop: 
     i=0 i<length()-1; one char shorter so j can start one char later
     i 0 to length -1
      j +1 to length() 
    */
    public static boolean isUniqueCharacterNestedLoop(String input){

        for(int i=0; i<input.length() - 1; i++){
            for(int j=i + 1; j<input.length(); j++){
                if(input.charAt(i) == input.charAt(j)){
                    return false;
                }
            }
        }
        return true;
    }

    /* Another efficient way to solve same problem
     * Use boolean array and set it to size 128 if ASCII or 256 if Unicode string.
     * Basically need to check char as a number
     */

    public static boolean isUniqueCharacterBooleanArray(String input){
        if (input == null || input.length() > 128) return false;
        
        boolean[] char_set = new boolean[128];
        for(int i=0; i<input.length(); i++){
            int checker = input.charAt(i);
            System.out.println(checker);
            if(char_set[checker]){          // checks if a character already exists
                return false;
            }
            char_set[checker] = true;
        }
        return true;
    }


    public static void main(String[] args) {
        String words [] = {"Mekan Hanov", "Hello", "Myself"};
        String more [] = {"more of W", "Hellow", "Myselw"};
        String input = "What is your favorite color?";
        String oneWord = "Helo";

        System.out.println(isUniqueCharacterBooleanArray(oneWord));

        // StringWords w = new StringWords(); // if non-static use reference to an object
        // System.out.println(w.merge(words, more));
        // System.out.println(merge(words, more));

        // System.out.println(joinWords(words));
        // System.out.println(joinWords2(words));

    }   
    
}
