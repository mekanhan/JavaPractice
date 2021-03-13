package codingBat.String2;

public class DoubleCharReverse {
    public String doubleChar(String str){
        String result = "";
        for (int i=str.length()-1; i>=0; i--){
           result = result + str.charAt(i) + str.charAt(i);
        }
        return result;
    }

    public static void main(String[] args) {

        DoubleCharReverse doub = new DoubleCharReverse();
        System.out.println(doub.doubleChar("Mekan"));
    }
}
