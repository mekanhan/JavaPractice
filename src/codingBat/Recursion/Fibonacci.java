package codingBat.Recursion;

public class Fibonacci {
    public int fibonacci(int n){
        if (n <= 1)
            return n;
        return fibonacci(n-1) + fibonacci(n-2);
    }

    public static void main(String[] args) {
        Fibonacci fib= new Fibonacci();
        System.out.println(fib.fibonacci(0));
        System.out.println(fib.fibonacci(1));
        System.out.println(fib.fibonacci(2));
    }
}
