package codingBat.Recursion;

public class bunnyEars2 {
    public int BunnyEars2(int bunnies){
//        if(bunnies %2==0 && bunnies>0){
//            return 3+bunnyEars2(bunnies-1);
//        }
//        if (bunnies %2!=0){
//            return 2+bunnyEars2(bunnies-1);
//        }
        return bunnies;
    }

    public static void main(String[] args) {
        bunnyEars2 bunn = new bunnyEars2();
        System.out.println(bunn.BunnyEars2(2));
        System.out.println(bunn.BunnyEars2(5));
        System.out.println(bunn.BunnyEars2(0));
        System.out.println(bunn.BunnyEars2(10));
        System.out.println(bunn.BunnyEars2(6));
    }
}
