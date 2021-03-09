package CodingBat.String;

public class AtFirst {
    public String atFirst(String str){
        if (str.length()>=2){
            String length = str.substring(0,2);
            return length;
        }
        if(str.length()<2){
            String length = str.substring(0) + "@";
            return length;
        }
        return str.substring(0,2);

        /*
        if(str.length() == 0)
        return "@@";

    if(str.length() == 1)
        return str + "@";

    return str.substring(0, 2);
         */
    }
    public static void main(String[] args) {
        AtFirst first = new AtFirst();
        System.out.println(first.atFirst("@"));
    }
}
