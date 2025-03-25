package enums;

public class EnumDays {
    enum Days {
        MONDAY, THUESDAY, WEDNESDAY, THURSDAY, FRIDAY,SATURDAY,SUNDAY
    }
    public static void main(String[] args) {
        for(Days days: Days.values()){
            System.out.println(days);
        }
    }
}
