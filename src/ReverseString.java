import java.util.Arrays;
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input String: ");
        String x = scanner.nextLine();

        System.out.println(reverse(x));

    }

    static String reverse(String string) {
        int len = string.length();
        String[] out = new String[len];

        for (int i = len; i > 0; i--) {
            out[len-i] = String.valueOf(string.charAt(i-1));
        }

        String output = "";
        for (String i : out) {
            output = output + i;
        }

        return output;
    }
}
