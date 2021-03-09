package edabit;

public class PerimeterRectangle {
    public static int findParameter(int length, int width){
        int results = 2*(length+width);
        return results;
    }
    public static void main(String[] args) {
        System.out.println(findParameter(7,5));
    }
}
