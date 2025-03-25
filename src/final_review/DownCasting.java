package final_review;

public class DownCasting {
    public static void main(String[] args) {
        Appliance ob1=new Appliance();
        Refrigerator ref=(Refrigerator)ob1;
        ref.cool();
        ref.Kitchen();
        ((Refrigerator) ob1).cool();
    }
}
class Appliance{
    void Kitchen(){
        System.out.println("Kitchen Appliance");
    }
}
class Refrigerator extends Appliance {
    void cool() {
        System.out.println("cooling");
    }
}

