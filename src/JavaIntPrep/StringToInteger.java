package JavaIntPrep;

public class StringToInteger {
    public static void main(String[] args) {

        String str = "12345";
        int result = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            result = result * 10 + (ch - '0');
        }
        System.out.println("The integer value is: " + result);
    }
}
