package leetCode.easy;

public class ReverseInteger {
    public int reverseInteger (int x){
        int reversed =0;
        while(x!=0){
            int digit = x%10;           //4 (last number)
            reversed=reversed*10+digit;
            x/=10;                      // first three digits
        }
        return reversed;

        /* // another java solution
        String reversed = new StringBuilder().append(Math.abs(x)).reverse().toString();
        try {
            return (x < 0) ? Integer.parseInt(reversed) * -1 : Integer.parseInt(reversed);
        } catch (NumberFormatException e) {
            return 0;
        }

         */
    }

    public static void main(String[] args) {
        System.out.println(1234%10);
        ReverseInteger r = new ReverseInteger();
        System.out.println(r.reverseInteger(1234));
    }
}
