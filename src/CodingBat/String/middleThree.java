package CodingBat.String;

public class middleThree {
    public String midThree(String odd){
        int mid = odd.length()/2;
        return odd.substring(mid-1, mid+2);
    }

    public static void main(String[] args) {
        middleThree mid = new middleThree();
        System.out.println(mid.midThree("Mekan"));
    }
}
