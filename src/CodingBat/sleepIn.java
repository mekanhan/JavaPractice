package CodingBat;

public class sleepIn {
    public static boolean sleep(boolean vacation, boolean weekday){
        if (!weekday || vacation){
            return true;
        }
        return false;
    }
}
