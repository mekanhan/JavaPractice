package codingBat.Recursion;

public class Triangle {
    public int triangle (int rows){
        if (rows>1){
            return rows+1;
        }
        return rows;
    }

    public static void main(String[] args) {
        Triangle t= new Triangle();
        System.out.println(t.triangle(0));
        System.out.println(t.triangle(1));
        System.out.println(t.triangle(2));
    }
}
