package flowchart;

public class Example_Finally {
    public static void main(String[] args) {
        try{
            System.out.println(6/0);
        }
        catch (ArithmeticException e){
            System.out.println("ooo zerooo");
        }
        catch (Exception e){
            System.out.println("Ooops");
        }
        finally {
            System.out.println("I will run this code whatever it takes");
        }
    }
}
