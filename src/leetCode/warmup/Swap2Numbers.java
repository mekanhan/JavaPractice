package leetCode.warmup;

public class Swap2Numbers {
    public void num(int a, int b){
        int c = a+b;    //12
        a = b;  //7
        b = c-a;  //5
        System.out.println(a + " " + b);
    }
    public static void main(String[] args) {
        Swap2Numbers obj = new Swap2Numbers();
        obj.num(5,7);
    }
}
