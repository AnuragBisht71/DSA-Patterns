// Input :- 6

// Output :- 21



package dynamicProgramming;

import java.util.Scanner;

public class count_binary_strings {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Input :- ");

        int n = scn.nextInt();

        int oSEW0 = 1 , oSEW1 = 1;

        for(int i = 2 ; i <= n ; i++) {
            int nSEW0 = oSEW1;
            int nSEW1 = oSEW0 + oSEW1;

            oSEW0 = nSEW0;
            oSEW1 = nSEW1;
        }

        System.out.println("Output :-");
        System.out.println(oSEW0 + oSEW1);

        scn.close();
    }    
}
