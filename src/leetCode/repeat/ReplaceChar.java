package leetCode.repeat;

public class ReplaceChar {
    public String RepChar (String str){
        String result = "";
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)=='?'){
                result=str.replace(str.charAt(i),'o');
            }
        }
        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
        ReplaceChar obj = new ReplaceChar();
        obj.RepChar("welc?me t? my W?rl?");
    }
}
