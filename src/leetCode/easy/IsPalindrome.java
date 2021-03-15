package leetCode.easy;
//https://leetcode.com/problems/palindrome-number/solution/
public class IsPalindrome {
    public boolean isPalindrome(int x){

        if(x<=9 && x >=0)   //to keep positive values only
            return true;
        if(x < 0 || x%10 ==0)   // return false if negative
            return false;
        int revertedNumber = 0;
        while(x > revertedNumber) {
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }

        // When the length is an odd number, we can get rid of the middle digit by revertedNumber/10
        // For example when the input is 12321, at the end of the while loop we get x = 12, revertedNumber = 123,
        // since the middle digit doesn't matter in palidrome(it will always equal to itself), we can simply get rid of it.
        return x == revertedNumber || x == revertedNumber/10;

    }

    public static void main(String[] args) {
        IsPalindrome i = new IsPalindrome();
        System.out.println(i.isPalindrome(123));
        System.out.println(i.isPalindrome(1221));
        System.out.println("1st iteration when x=1222 revert = "+1221%10);
        System.out.println("2nd iteration when x=122 revert = " + 122%10);
        System.out.println("3d iteration when x=12 revert = " + 12%10);
//        System.out.println("4th iteration when x=1 revert = " + 1%10);


    }
}
