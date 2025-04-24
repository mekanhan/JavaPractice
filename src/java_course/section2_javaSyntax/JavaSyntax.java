package java_course.section2_javaSyntax;
public class JavaSyntax {
    public static void main(String[] args) {
    //    isItFun(true);
        // printMegaBytesAndKilobytes(11026);
        // System.out.println(isLeapYear(1800));

        // convertToCentimeters(50);
        // convertToCentimeters(6, 1);
        getDurationString(3900);

        // double myDouble = 20.00;
        // double mySecondDouble = 80.00;
        // double myTotal = (myDouble + mySecondDouble) * 100.00;
        // System.out.println("My total is: " + myTotal);
        // double myRemainder = myTotal % 40.00;
        // System.out.println("My Remainder is: " + myRemainder);
        // boolean myBoolean = (myRemainder == 0) ? true : false;
        // System.out.println("My boolean is: " + myBoolean);
        // if(!myBoolean) {
        //     System.out.println("Got some remainder!");
        // } else {
        //     System.out.println("No remainder!");
        // }

        // toMilesPerHour(10.5);
    }
    
    public static void isItFun(boolean javaString) {
        if(javaString == true) {
            System.out.println("Java is fun!");
        } else {
            System.out.println("Java is not fun!");
        }
    }

    public static int toMilesPerHour(double kilometersPerHour){
        int returnValue = 0;
        double conversionFactor = 0.621371; // kmh to mph
        
        if(kilometersPerHour < 0){
            returnValue = -1;
        }
        else if(kilometersPerHour > 0){
            double calculatedSpeed = conversionFactor * kilometersPerHour;
            long roundedSpeed = Math.round(calculatedSpeed);
            returnValue = (int) roundedSpeed;
            System.out.println(kilometersPerHour + " km/h = " + roundedSpeed + " mi/h");   
        }
        return returnValue;
    }

    public static void printMegaBytesAndKilobytes(int kiloBytes){
        
        if(kiloBytes < 0){
            System.out.println("Invalid Value");
        }
        else{
            int megabytes = kiloBytes / 1024;
            int remainingKilobytes = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + megabytes + " MB and " + remainingKilobytes + " KB");
        }
    }

    public static boolean isLeapYear(int year){
        boolean result = false;
        
        if(year >= 1 && year <= 9999){
            
            if(year % 400 == 0 || year % 4 == 0){
              result = true;
            }
            else if(year % 100 == 0){
                result = false;
            }    
        }
        return result;
    }

    public static void convertToCentimeters(int heightInches){
        double conversionFactor = 2.54; // inches to cm
        double centimeters = heightInches * conversionFactor;
        System.out.println("centimeters: " + centimeters);
    }

    public static void convertToCentimeters(int heightFeet, int heightInches){
        double conversionFactor1 = 12 * 2.54; // inches to cm
        double conversionFactor2 = 2.54; // inches to cm
        double centimeters = heightFeet * conversionFactor1 + heightInches * conversionFactor2;
        System.out.println("centimeters: " + centimeters);
    }

    public static String getDurationString(int seconds){
        String results = "";
        int minutes = 0;
        if(seconds >= 60){
            minutes = seconds / 60;
            results = getDurationString(seconds, minutes);
        }
       System.out.println(results);
        return results;
    }

    public static String getDurationString(int seconds, int minutes){
        String results = " ";
        int hours = 0;
        if(minutes > 0){
            hours = minutes / 60;
            results = hours + "h " + minutes + "m " + seconds + "s";
        }
        else if (minutes < 0 && seconds > 0){
            hours = seconds / 3600;
            results = hours + "h " + minutes + "m " + seconds + "s";
        }
       

        return results;
    }


    
}