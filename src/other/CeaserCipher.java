package other;

import java.util.Scanner;

class CaesarCipher {
    // Encrypts text using a shift od s
    public static StringBuffer encrypt(String text, int s) {
        StringBuffer result= new StringBuffer();
        for (int i=0; i<text.length(); i++) {
            if (Character.isUpperCase(text.charAt(i))) {
                char ch = (char) (s % 26);
                result.append(ch);
            }
            else {
                char ch = (char) (s % 26);
                result.append(ch);
            }
        }
        return result;
    }
    // Driver code
    public static void main(String[] args) {

        Scanner textIn = new Scanner(System.in);
        System.out.print("Enter 10 letters: ");
        String text = textIn.nextLine();

        Scanner keyIn = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int s = keyIn.nextInt();

        System.out.println("Text : " + text);
        System.out.println("Shift : " + s);
        System.out.println("Cipher: " + encrypt(text, s));
    }
}