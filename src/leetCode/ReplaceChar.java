package leetCode;

public class ReplaceChar {
    public static String Replaced(String riddle){
        String fin="";
        int count=0;
//        int que [] = new int[riddle.length()];
//        for (int i=0; i<riddle.length(); i++){
//            if(riddle.indexOf(i)=='?'){
//                que [i] = riddle.indexOf(i);
//            }
//        }
        for(int i=0;i<riddle.length();i++){
            if(riddle.charAt(i)=='?'){
                fin=riddle.replace(riddle.charAt(i),'z');
                count++;
            }
        }
        System.out.println(fin + " " + count);
        return fin;
    }

    public static void main(String[] args) {
        ReplaceChar obj = new ReplaceChar();
        obj.Replaced("ab?ac?");
    }
}
