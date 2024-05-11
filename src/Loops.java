/*
   TASK:
    Using indexed loops with logic, output:

    ABCDEFGFEDCBA
    ABCDEF FEDCBA
    ABCDE   EDCBA
    ABCD     DCBA
    ABC       CBA
    AB         BA
    A           A

    i.e. You are not allowed to write:

    //System.out.println("ABCDEFGFEDCBA");
    //System.out.println("ABCDEF FEDCBA");
    etc...

 */

public class Loops {
    public static void main(String[] args) {
        myOwn();
        //chatGPT();
    }
    static void myOwn() {
        //String output = null;

        for (int i=7; i>0; i--) {
            for (int j=0; j<i; j++) {
                int character = j + 65;
                System.out.print((char) character);
                //output = output + (char) character;
            }
            int spaces = (7 - i) * 2 - 1;
            for (int j=0; j<spaces; j++) {
                System.out.print(" ");
                //output = output + " ";
            }
            if (i != 7) {
                for (int j = i; j > 0; j--) {
                    int character = j + 65 - 1;
                    System.out.print((char) character);
                    //output = output + (char) character;
                }
            } else if (i == 7) {
                for (int j = i-1; j > 0; j--) {
                    int character = j + 65 - 1;
                    System.out.print((char) character);
                    //output = output + (char) character;
                }
            }
            System.out.println();
        }
    }

    static void chatGPT() {
        int n = 7; // Number of characters in the first line
        char startChar = 'A';

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print((char) (startChar + j));
            }
            for (int k = 0; k < 2 * i; k++) {
                System.out.print(" ");
            }
            for (int l = n - i - 1; l >= 0; l--) {
                if (l != n - 1) {
                    System.out.print((char) (startChar + l));
                }
            }
            System.out.println();
        }
    }
}
