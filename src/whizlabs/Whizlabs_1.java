package whizlabs;
import java.util.ArrayList;
import java.util.List;

public class Whizlabs_1 {
    public static void main(String [ ] args) {
        List<String>  ints   = new ArrayList<>();

        ints.add("a");
        ints.add("b");
        ints.add("c");

        while(!ints.isEmpty()){         // ints empty or not
            System.out.print(ints.remove(0));
        }
    }
}
