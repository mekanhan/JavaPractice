package enums;

public class SeasonEnum {
    enum Level{
        Winter,
        Spring,
        Summer,
        Autumn,
    }
    public static void main(String[] args){
        Level myEnum = Level.Winter;
        Level myEnum2 = Level.Spring;
        Level myEnum3 = Level.Summer;
        Level myEnum4 = Level.Autumn;
        System.out.println(myEnum);
        System.out.println(myEnum2);
        System.out.println(myEnum3);
        System.out.println(myEnum4);
    }
}