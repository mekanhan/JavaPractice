package leetCode;

public class isPalindrome {
    public static boolean Palindrome(int x) {
        String st=Integer.toString(x);
        boolean result = false;
        String reversed = "";
        for ( int i=st.length()-1; i>=0; i--) {
            reversed = reversed + st.charAt(i);
        }
        for (int i=0;i<st.length()/2;i++){
            if(st.charAt(i)==reversed.charAt(i)){
                result = true;
            }
        }
        System.out.println(result);
        return result;
    }
    public static void main(String[] args) {
        isPalindrome obj = new isPalindrome();
        obj.Palindrome(122);
        obj.Palindrome(1221);
        obj.Palindrome(123);
        obj.Palindrome(11211);
    }
}
