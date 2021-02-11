package CodingBat;

public class CeaserPartB {
    public static StringBuilder decrypt(String cipher, int s) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < cipher.length(); i++) {
            if (Character.isUpperCase(cipher.charAt(i))) {
                char ch = (char) (((int) cipher.charAt(i)- s - 65) % 26 + 65);
                result.append(ch);
            } else {
                char ch = (char) (((int) cipher.charAt(i)  - s - 97) % 26 + 97);
                result.append(ch);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        String text = "qwertyuiop";
        int s = 1;
        System.out.println("Text  : " + text);
        System.out.println("Shift : " + s);
        System.out.println("Cipher: " + decrypt(text, s));
    }
}
