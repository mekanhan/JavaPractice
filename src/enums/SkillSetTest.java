package enums;

public class SkillSetTest {
    public static void main(String[] args) {
        SkillSets mySkill = SkillSets.Java;
        switch (mySkill){
            case SQL:
                System.out.println("Practice Relational Database");
                break;
            case Java:
                System.out.println("Solve a problem a lot");
                break;
            case Selenium:
                System.out.println("Prepare your framework");
                break;
        }
    }
}
