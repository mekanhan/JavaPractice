package leetCode;

import java.util.Arrays;

public class RomanToInt {
    public int romanToInt(String s) {
        int str [] = new int[s.length()];
        int result=0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='I') str[i]=1;
            else if(s.charAt(i)=='V') str[i]=5;
            else if(s.charAt(i)=='X') str[i]=10;
            else if(s.charAt(i)=='L') str[i]=50;
            else if(s.charAt(i)=='C') str[i]=100;
            else if(s.charAt(i)=='D') str[i]=500;
            else if(s.charAt(i)=='M') str[i]=1000;
            if(str[0]>=str[str.length-1])
                result+=str[i];
            else if(str[0]<str[str.length-1])
                result-=str[i];
        }
        System.out.println(Math.abs(result));
        return result;
    }
    public static void main(String[] args) {
        RomanToInt obj = new RomanToInt();
        obj.romanToInt("III");
        obj.romanToInt("XII");
        obj.romanToInt("IIX");
        obj.romanToInt("LCD");
        obj.romanToInt("DCL");
    }
}
