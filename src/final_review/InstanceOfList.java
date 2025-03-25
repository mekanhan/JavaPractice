package final_review;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InstanceOfList {
    public static void main(String[] args) {
        List<Pen> list = new ArrayList<>();
        list.add(new Pen());
//        list.add(new Crayola());
        list.add(new Pen());

        list.forEach(element ->{
            element.write();
        });


    }
}
class Pen{
    void write(){
        System.out.println("Writing");
    }
}
