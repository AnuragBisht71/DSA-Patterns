// Input :-

// 5
// 15 14 10 45 30
// 2 5 1 3 4
// 7

// Ouput :-

// 75



package dynamicProgramming;

import java.util.Scanner;

public class zero_one_knapsack {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Input :-");

        int n = scn.nextInt();

        int vls[] = new int[n];
        for(int i = 0 ; i < n ; i++) {
            vls[i] = scn.nextInt();
        }

        int wts[] = new int[n];
        for(int i = 0 ; i < n ; i++) {
            wts[i] = scn.nextInt();
        }

        int cap = scn.nextInt();
        int dp[][] = new int[n+1][cap+1];

        for(int i = 1 ; i <= n ; i++) {
            int wt = wts[i-1];
            int vl = vls[i-1];
            for(int j = 1 ; j <= cap ; j++) {
                dp[i][j] = dp[i-1][j];
                if(j >= wt) {
                    dp[i][j] = Math.max(dp[i-1][j-wt] + vl , dp[i][j]);
                }
            }
        }

        System.out.println("Output :-");
        System.out.println(dp[n][cap]);

        scn.close();
    }
}
