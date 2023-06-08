// Input :- 6

// Output :- 441



package dynamicProgramming;

import java.util.Scanner;

public class average_buildings {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Input :-");

        long n = scn.nextInt();

        long oB = 1 , oS = 1;

        for(int i = 2 ; i <= n ; i++) {
            long nB = oS;
            long nS = oB + oS;

            oB = nB;
            oS = nS;
        }

        long total = oB + oS;

        System.out.println("Output :-");
        System.out.println(total * total);

        scn.close();
    }    
}
