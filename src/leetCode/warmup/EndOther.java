package leetCode.warmup;

public class EndOther {
    public boolean endOther(String a, String b) {
        boolean result = false;
        String newA="";
        String newB="";
//        a=a.toLowerCase();
//        b=b.toLowerCase();
        if(a.length()>=b.length()){
            newA=a.substring(a.length()-b.length(),a.length());
            System.out.println(newA);
            if(newA.equalsIgnoreCase(b)){
                result = true;
            }
        }
        else if(a.length()<=b.length()){
            newB=b.substring(b.length()-a.length(),b.length());
            System.out.println(newB);
            System.out.println(newB.length());
            System.out.println(a);
            System.out.println(a.length());
            if(newB.equalsIgnoreCase(b)){
                result = true;
            }
        }
        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
        EndOther obj = new EndOther();
        obj.endOther("AbC", "HiaBc");
    }
}
