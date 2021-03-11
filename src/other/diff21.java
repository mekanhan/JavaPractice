package other;

public class diff21 {
    public int difference(int n) {
        if(n>21){
            return Math.abs(2*(21-n));
        }
        return Math.abs(21-n);
    }
    public static void main(String args[]){
        diff21 diff = new diff21();
        System.out.println(diff.difference(15));
    }
}
