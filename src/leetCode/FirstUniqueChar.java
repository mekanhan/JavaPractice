package leetCode;

public class FirstUniqueChar {
    public int firstUniqChar(String s) {
        char duplicate;
        duplicate = s.charAt(0);
        int result =-1;
        for(int i=0; i<s.length(); i++){
            System.out.println(duplicate);
            if(s.charAt(i)!=duplicate){
                result = s.indexOf(i);
            }
            duplicate = s.charAt(
                    i);
            System.out.println(duplicate);
        }
        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
        FirstUniqueChar obj = new FirstUniqueChar();
        obj.firstUniqChar("leetcode");

    }
}
