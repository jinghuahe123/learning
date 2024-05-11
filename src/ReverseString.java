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

        StringBuilder output = new StringBuilder();
        for (String i : out) {
            output.append(i);
        }

        return output.toString();
    }
}
