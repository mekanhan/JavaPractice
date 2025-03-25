package codingBat.WarmUp2;

public class stringBits {
    boolean Rocket(String str){
        char [] arr = str.toCharArray();
        boolean answer = false;
        System.out.println(arr );
        for(int i=0; i<arr.length; i++){

                answer = true;

        }
        return answer;
    }
    boolean Rocket2(String [] str){
        boolean answer = false;
        for(int i=0; i< str.length-1; i++){
            answer = true;

        }
        return answer;
    }
    public static void main(String[] args) {
        stringBits check = new stringBits();
        System.out.println(check.Rocket("xxertxx"));
        System.out.println(check.Rocket("xertx"));
        System.out.println(check.Rocket("xertxxx"));
//        System.out.println(check.Rocket2(new String[]{"x","x","e","r","t","x","x"}));
//        System.out.println(check.Rocket2(new String[]{"x","e","r","t","x"}));
//        System.out.println(check.Rocket2(new String[]{"x","e","r","t","x","x","x"}));
    }
}
