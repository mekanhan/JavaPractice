package CodingBat.String;

public class MakeAbba {
    public String makeAbba(String a, String b){

        return a + b + b + a;
    }

    public static void main(String[] args) {
        MakeAbba make = new MakeAbba();
        System.out.println(make.makeAbba("Aynur"," my Love "));
    }
}
