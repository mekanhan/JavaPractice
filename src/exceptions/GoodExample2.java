package exceptions;

public class GoodExample2 {
    public static void main(String[] args) {
        String arr[]={"1","12","null","null","123","null","1234"};
        //     index=  0,   1,    2,     3,    4,     5,     6
        try{
            for (int i=0; i<arr.length; i++){
                System.out.println(arr[i].length());
            }
        }
        catch (Exception e){
            System.out.println("oops");
        }
        System.out.println("Rest of the code");
    }
}
