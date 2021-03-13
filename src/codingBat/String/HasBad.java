package codingBat.String;

public class HasBad {
    public Boolean hasBad(String str){
       if (str.length()==3){
           return str.substring(0,3).equals("bad");
       }
       else if(str.length()>=4){
           return str.substring(0,3).equals("bad") ||
                   str.substring(1,4).equals("bad");
       }
        return false;
    }

    public static void main(String[] args) {
        HasBad bad = new HasBad();
        System.out.println(bad.hasBad("badass"));
    }
}
