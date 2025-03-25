package exceptions;

public class GoodExample {
    public static void main(String[] args) {
        String arr[] = {"a1", "b123", null, "c", "fsfd", null, "sdasf"};
        try{
            for (int i=0; i<arr.length; i++){
                System.out.println(arr[i].length());
            }
        }
        catch (NullPointerException e){
            System.out.println("oops");
        }
        finally {
            System.out.println(arr[6].length()); // if [5] then exception error pops up
        }
        System.out.println("-----------------------------------");
        for (int i=0; i<arr.length; i++){
            try {
                System.out.println(arr[i].length());
            }
            catch (NullPointerException e){
                System.out.println("oops");
            }
        }
    }
}
