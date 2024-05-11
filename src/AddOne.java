/*
 * https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/559/
 *
 * Given a non-empty array of decimal digits representing a non-negative integer, increment one to the integer.
 *
 * The digits are stored such that the most significant digit is at the head of the list, and each element in the array contains a single digit.
 *
 * You may assume the integer does not contain any leading zero, except the number 0 itself.
 *
 * Example 1:
 * Input: digits = [1,2,3]
 * Output: [1,2,4]
 * Explanation: The array represents the integer 123.
 *
 * Example 2:
 * Input: digits = [4,3,2,1]
 * Output: [4,3,2,2]
 * Explanation: The array represents the integer 4321.
 *
 * Example 3:
 * Input: digits = [0]
 * Output: [1]
 *
 * Constraints:
 *     1 <= digits.length <= 100
 *     0 <= digits[i] <= 9
 */

import java.util.Arrays;
import java.util.Scanner;

public class AddOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter array Size: ");
        int size = scanner.nextInt();
        int[] input = new int[size];
        System.out.println("Enter array values: ");
        for (int i=0; i<size; i++) {
            if (scanner.hasNextInt()) {
                input[i] = scanner.nextInt();
            }
        }

        System.out.println(Arrays.toString(example(input)));
        //System.out.println(Arrays.toString(efficient(input))); //DEPRECATED MAY NOT WORK
        //System.out.println(Arrays.toString(convertInt(input)));
    }



    static int[] convertInt(int[] input) {
        //System.out.println(Arrays.toString(input));
        String process = "";
        for (int j : input) {
            process = process + j;
        }
        int output = Integer.parseInt(process) + 1;

        String convert = String.valueOf(output);

        //System.out.println(convert);

        int[] out = new int[convert.length()];
        for (int i=0; i<convert.length(); i++) {
            //System.out.println(convert.charAt(i-0));
            out[i] = convert.charAt(i)-'0';
        }

        return out;
    }

    static int[] efficient(int[] input) {
        int length = input.length-1;
        //System.out.println(input[length]);
        boolean overflow = false;
        boolean flag = false;
        boolean doIt = true;
        //int[] output = new int[size+1];
        int[] output = new int[input.length+1];
        //System.out.println(length);
        //System.out.println(size);
        for (int i=length; i>=0; i--) {
            if (overflow) {
                input[i] += 1;
                overflow = false;
                doIt = false;
            }

            if (input[i] == 9) {
                input[i] = 0;
                overflow = true;
                doIt = false;
            } else if (i == 0 && input[i] == 10) {
                for(int j=0; j<length; j++) {
                    output[j] = input[j];
                }
                output[i] = 1;
                output[input.length+1] = 0;
                flag = true;
                doIt = false;
            } else if (input[i] == 10) {
                input[i] = 0;
                overflow = true;
                doIt = false;
            }
        }
        if (doIt) input[length] += 1;

        /*
        if (!flag) {
            return input;
        } else if (flag) {
            return output;
        }
        */
        return input;
    }

    static int[] example(int[] input) {
        boolean flag = false;
        int carry = 0;

        for (int i=input.length; i>0; i--) {
            if (i==input.length) {
                input[i-1] += 1;
            } else {
                if (input[i]>9) {
                    input[i] -= 10;
                    input[i-1]++;
                }
            }
        }

        return input;
    }
}
