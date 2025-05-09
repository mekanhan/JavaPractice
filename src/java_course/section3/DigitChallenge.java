package java_course.section3;

public class DigitChallenge {
    public static void main(String[] args) {
        // System.out.println(sumDigits(1024));
        // System.out.println(sumDigits(1054));
        // System.out.println(sumDigits(10));
        // System.out.println(sumFirstAndLastDigit(123456));
        // System.out.println(sumFirstAndLastDigit(1221));
        // System.out.println(sumFirstAndLastDigit(1331));

        // System.out.println(getEvenDigitSum(252));
        // System.out.println(getEvenDigitSum(123456789));
        // System.out.println(getEvenDigitSum(2000));
        
        // System.out.println(isPalindrome(135531));
        // System.out.println(isPalindrome(123));

        // printFactors(6);
        // printFactors(32);
        // printFactors(10);

        System.out.println(getGreatestCommonDivisor(10, 15));
    }

    public static int sumDigits(int n){
        int result = 0;
        if(n < 0){
            System.out.println("Invalid value: " + -1);
            return -1;
        }
        
        while (n > 9){
            result += (n % 10);
            n = n / 10;
        }
        
        result += n;

        return result;
    }

    public static boolean isPalindrome(int number) {
        
        int reverse = 0;
        int original = number;
        while (original != 0) {
            reverse = reverse * 10 + original % 10;
            System.out.println(reverse);

            original = original / 10;
            System.out.println(original);
        }
        return reverse == number;
    }

    public static int sumFirstAndLastDigit (int number){
        System.out.println(number);
        if(number<0){
            return -1;
        }
        int lastDigit = 0;
        int firstDigit = 0;
        int sum = 0;
        int originalLast = 0;
        
        while(number >= 10){
            number = number / 10;
            System.out.println(number);
            if(number % 2 == 0){
                lastDigit = number % 10;
                sum = sum + lastDigit;
                System.out.println( "SUM: " + sum);
            }
            
        }
        firstDigit = number;
        System.out.println(originalLast + sum + "TOTAL");

        return firstDigit + lastDigit;
    }
    
    public static int getEvenDigitSum(int number){
        System.out.println(number);
        if(number<0){
            return -1;
        }
        int lastDigit = 0;
        int sum = 0;
        int originalLast = 0;
        
        while(number >= 1){
            
            if(number % 2 == 0){
                lastDigit = number % 10;
                sum = sum + lastDigit;
            }
            number = number / 10;
        }
        return originalLast + sum;
    }

    public static boolean hasSameLastDigit(int a, int b, int c){
        if(a < 10 || a > 1000 || b < 10 || b > 1000 || c < 10 || c > 1000){
            return false;
        }
        
        boolean result = false;
        int lastA = a % 10;
        int lastB = b % 10;
        int lastC = c % 10;
        
        if(lastA == lastB || lastA == lastC || lastB == lastC){
            result = true;
        }
        
        return result;
    }


    public static void printFactors(int number){
        if(number < 1){
            System.out.println("Invalid Value");
        }

        int remainder = 0;
        int count = number;
        while( (count) >= 1 ){
            remainder = number % count;
            
            if(remainder == 0){
                System.out.println(number/count);
            }
            count--;
            
        }
    }


    public static int getGreatestCommonDivisor(int first, int second){
        if(first < 10 || second < 10){
            return -1;
        }
        while (second != 0) {
            int temp = second;
            second = first % second;
            first = temp;
        }
    
        return first;
    }


}
