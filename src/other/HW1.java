package other;

import java.util.Scanner;

public class HW1 {
    public static void main(String[] args) {

        Scanner textIn = new Scanner(System.in);
        System.out.print("Enter 10 letters: ");
        String Text = textIn.nextLine();

        if (Text.length()>11) {
            String cutText = Text.substring(0, 10);
            Text = cutText;
            System.out.print("You entered: " +Text+'\n');
        }
        else {
            System.out.println("You entered more than 11 letters");
        }

        Scanner keyIn = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int key = keyIn.nextInt();
        if (key>26){
            key = key % 26;
            System.out.println("Key: " + key);
        }
        else if (key<0){
            System.out.println("invalid");
        }
        else {
            System.out.println("Key: " + key);
        }
        char cipher = Text.charAt(key);
        StringBuffer result = new StringBuffer();
        result.append(key);
        System.out.println("cipher: " + cipher);


    }
}
