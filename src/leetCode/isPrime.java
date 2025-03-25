package leetCode;

public class isPrime {
    public static boolean Prime(int num){
        boolean prime = true;
        if(num<=1){
            prime = false;
        }
        else{
            for(int i=2; i<num; i++){
                if(num %i==0){
                    prime = false;
                    break;
                }
            }
        }
        if(prime){
            System.out.println("the " + num + " is prime");
        }
        else {
            System.out.println("the " + num + " is not prime");
        }
        return prime;
    }

    public static void main(String[] args) {
        isPrime obj = new isPrime();
        obj.Prime(21);
    }
}
