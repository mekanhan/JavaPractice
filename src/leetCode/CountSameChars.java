package leetCode;

public class CountSameChars {
    public static int Count(String str){
        int count=0;
        char ch;
        char ch2;
        for(int i=0; i<str.length();i++){
            ch = str.charAt(i);
            if(str.charAt(i)==' '){
                count++;
            }
        }
        System.out.println(count);
        return count;
    }
    public static String sp(String str){
        String str2="";

        return str2;
    }

    public static void main(String[] args) {
        CountSameChars obj = new CountSameChars();
        obj.Count("Hi there. My name is here");
    }
}
