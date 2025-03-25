package leetCode.warmup;

public class CountHi {
    public int countHi(String str) {
        int count=0;
        int result=0;
        String hi = "";
        for(int i=0; i<str.length()-1; i++){
            if((str.charAt(i)=='h') && (str.charAt(i+1)=='i')){
                hi=str.substring(i,i+2);
                count++;
            }
        }
        System.out.println(count);
        return count;
    }
    public static void main(String[] args) {
        CountHi obj = new CountHi();
        obj.countHi("hihikas");
        obj.countHi("hi hikas");
        obj.countHi("ABChi hi");
        obj.countHi("hi hikas");
    }
}
