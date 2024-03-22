import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input String: ");
        String x = scanner.nextLine();

        int len_x = x.length();

        //System.out.println(x.charAt(1));

        for (int i = len_x; i > 0; i--) {
            //x.toCharArray(System.out::println);
            System.out.print(x.charAt(i-1));
            //System.out.println(i);
        }
    }
}
