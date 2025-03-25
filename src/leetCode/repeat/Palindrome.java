package leetCode.repeat;

public class Palindrome {
    public boolean Poly(String str){
        boolean result = false;
        String reverse = "";
        for(int i=str.length()-1; i>(str.length()/2)-1; i--){
            reverse+=str.charAt(i);
        }
        if(str.substring(0,str.length()/2).equals(reverse)){
            result = true;
            System.out.println(true);
        }
        return result;
    }

    public static void main(String[] args) {
        Palindrome obj = new Palindrome();
        obj.Poly("hiih");
        obj.Poly("hiuih");
    }
}
