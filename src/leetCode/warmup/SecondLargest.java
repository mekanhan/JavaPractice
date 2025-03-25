package leetCode.warmup;

public class SecondLargest {
    public void secondLar(int [] num){
        int largest = 0;
        int smallest = 0;
        int secondLargest = 0;
        for(int i=0; i<num.length; i++){
            if(num[i]>largest){
                secondLargest = largest;
                largest = num[i];
            }
            else if(num[i]>secondLargest && secondLargest!=largest)
                secondLargest = num[i];
        }
        System.out.println(secondLargest);
    }

    public static void main(String[] args) {
        SecondLargest obj = new SecondLargest();
        obj.secondLar(new int[]{1, 3, 5, 9, 10, 35});
    }
}
