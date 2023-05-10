// Print Encodings

// Input :-

// 655196

// Output :-

// feeaif
// feesf



package recursion.recursionOnTheWayUp;

import java.util.Scanner;

public class recursion_07 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Input :-");

        String str = scn.nextLine();

        System.out.println("Output :-");
        printEncodings(str , "");

        scn.close();
    }

    public static void printEncodings(String str , String enc) {
        if(str.length() == 0) {
            System.out.println(enc);
            return;
        }

        if(str.length() == 'o') {
            return;
        }

        char firstChar = str.charAt(0);
        int num1 = Integer.parseInt(firstChar + "");
        printEncodings(str.substring(1), enc + (char)('a' + num1 - 1));

        if(str.length() > 1) {
            char secondChar = str.charAt(1);
            int num2 = Integer.parseInt("" + firstChar + secondChar);
            
            if(num2 >= 10 && num2 <= 26) {
                printEncodings(str.substring(2), enc + (char)('a' + num2 - 1));
            }
        }
    }
}
