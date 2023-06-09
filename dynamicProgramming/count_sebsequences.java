package dynamicProgramming;

import java.util.Scanner;

public class count_sebsequences {
    Scanner scn = new Scanner(System.in);
    String str = scn.nextLine();

    int a = 0 , ab = 0 , abc = 0;

    for(int i = 0 ; i < str.length() ; i++) {
        char ch = str.charAt(i);

        if(ch == 'a') {
            a = 2 * a + 1;
        }
        else if(ch == 'b') {
            ab = 2 + ab + 1;
        }
        else if(ch == 'c') {
            abc = 2 * abc + 1;
        }
    }

    System.out.println("Output :-");
    System.out.println(abc);
}
