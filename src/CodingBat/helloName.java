package CodingBat;

public class helloName {
    public String helloName(String name) {
        return "Hello " + name + "!";
    }

    public static void main(String[] args) {
        helloName name = new helloName();
        System.out.println(name.helloName("Bob"));
    }
}
