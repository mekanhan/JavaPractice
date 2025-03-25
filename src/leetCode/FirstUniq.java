package leetCode;

public class FirstUniq {
    public int firstUniqChar(String s) {
        char[] str= s.toCharArray();
        int result=0;
        for(int i=0; i<s.length(); i++){
            for(int j=i+1; j<s.length(); j++){
                if(str[i]!=str[j]){
                    System.out.println(str[i] + " " + str[j]);
                    result = i;
//                    System.out.println(result);
                    break;
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        FirstUniq obj = new FirstUniq();
        obj.firstUniqChar("leetcode");
    }
}
