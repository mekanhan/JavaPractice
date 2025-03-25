package string_Processing;

public class BlueOrRed {
    public static void main(String[] args) {
        System.out.println(seeColor("redxx"));
        System.out.println(seeColor("xxred"));
        System.out.println(seeColor("blueTimes"));
    }
    public static String seeColor(String color){
        if (color.substring(0,3).equals("red")){
            return "red";
        }
        else if (color.substring(0,4).equals("blue")){
            return "blue";
        }
        else {
            return "";
        }

    }
}
