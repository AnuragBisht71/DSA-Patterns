// Print Permutations

// Input :-

// abc

// Output :-

// abc
// acb
// bac
// bca
// cab
// cba



package recursion.recursionOnTheWayUp;

import java.util.Scanner;

public class recursion_06 {
    public static void main(String[] args) {
        System.out.println("Enter Input :-");
        Scanner scn = new Scanner(System.in);

        String str = scn.nextLine();

        System.out.println("Output :-");
        printPermutations(str, "");

        scn.close();
    }

    public static void printPermutations(String str, String asf) {
        if(str.length() == 0) {
            System.out.println(asf);
            return;
        }

        for(int i = 0 ; i < str.length() ; i++) {
            char ch = str.charAt(i);
            String roq = str.substring(0 , i) + str.substring(i + 1);
            printPermutations(roq, asf + ch);
        }
    }
}
