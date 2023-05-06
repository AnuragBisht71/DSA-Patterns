// Print KPC

// Given :-

// The following list is the key to characters map :-
// 0 -> .;
// 1 -> abc
// 2 -> def
// 3 -> ghi
// 4 -> jkl
// 5 -> mno
// 6 -> pqrs
// 7 -> tu
// 8 -> vwx
// 9 -> yz


// Input :- 78

// Output :-

// tv
// tw
// tx
// uv
// uw
// ux



package recursion.recursionOnTheWayUp;

import java.util.Scanner;

public class recursion_03 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Input :-");

        String str = scn.nextLine();

        System.out.println("Output :-");
        printKPC(str,"");

        scn.close();
    }

    public static String keypad[] = {".;" , "abc" , "def" , "ghi" , "jkl" , "mno" , "pqrs" , "tu" , "vwx" , "yz"};

    public static void printKPC(String str, String asf) {
        if(str.length() == 0) {
            System.out.println(asf);
            return;
        }

        char ch = str.charAt(0);
        String roq = str.substring(1);
        String word = keypad[Integer.parseInt(ch+"")];

        for(int idx = 0 ; idx < word.length() ; idx++) {
            printKPC(roq, asf + word.charAt(idx));
        }
    }
}
