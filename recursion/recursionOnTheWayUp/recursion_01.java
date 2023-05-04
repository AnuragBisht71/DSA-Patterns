// Print Subsequence

// Input :-  yvTA

// Output :-

// yvTA
// yvT
// yvA
// yv
// yTA
// yT
// yA
// y
// vTA
// vT
// vA
// v
// TA
// T
// A



package recursion.recursionOnTheWayUp;

import java.util.Scanner;

public class recursion_01 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Output :-");

        String str = scn.nextLine();

        printSS(str,"");

        scn.close();
    }

    public static void printSS(String str, String asf) {
        if(str.length() == 0) {
            System.out.println(asf);
            return;
        }

        char ch = str.charAt(0);
        String s = Character.toString(ch);
        String roq = str.substring(1);

        printSS(roq, asf+s);
        printSS(roq, asf);
    }
}
