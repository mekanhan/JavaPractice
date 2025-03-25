package leetCode;

public class Largest4Sticks {
    public static int Sticks(int A, int B){
        int oddA = A/3;
        int evenA = A/2;
        int oddB = B/3;
        int evenB = B/2;
        int[] list = {oddA, oddB, evenA, evenB};
        int max=0;
        for (int i=0; i<list.length; i++){
            int temp = list[i];
            if(temp>max && list[i]*4<(A+B)){
                max = list[i];
            }
        }
        System.out.println(max + ", " + max*4 + ", " + (A+B));
        return max;
    }
    public static void main(String[] args) {
        Largest4Sticks obj = new Largest4Sticks();
        obj.Sticks(10,21);
        obj.Sticks(13,11);
        obj.Sticks(2,1);
        obj.Sticks(1,8);

    }
}
