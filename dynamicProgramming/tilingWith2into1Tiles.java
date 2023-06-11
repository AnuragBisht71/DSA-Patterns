// Input :- 8

// Output :- 34



package dynamicProgramming;

import java.util.Scanner;

public class tilingWith2into1Tiles {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Input :-");

        int n = scn.nextInt();

        int dp[] = new int[n+1];

        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;

        for(int i = 3 ; i <= n ; i++) {
            dp[i] = dp[i-1]+dp[i-2];
        }

        System.out.println("Output :-");
        System.out.println(dp[n]);

        scn.close();
    }
}
