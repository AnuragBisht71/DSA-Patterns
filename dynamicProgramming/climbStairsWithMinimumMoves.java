// Input :-

// 10
// 3
// 3
// 0
// 2
// 1
// 2
// 4
// 2
// 0
// 0

// Output :-

// 4



package dynamicProgramming;

import java.util.Scanner;

public class climbStairsWithMinimumMoves {
    public static void main(String [] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Input :-");

        int n = scn.nextInt();

        int moves[] = new int[n]; 
        for(int i = 0 ; i < n ; i++) {
            moves[i] = scn.nextInt();
        }

        Integer dp[] = new Integer[n+1];
        dp[n] = 0;

        for(int i = n-1 ; i >= 0 ; i--) {
            int move = moves[i];
            Integer min = Integer.MAX_VALUE;

            if(move > 0) {
                for(int j = 1 ; j <= move && i + j <= n ; j++) {
                    if(dp[i+j] != null) {
                        min = Math.min(min , dp[i+j]);
                        dp[i] = min+1;
                    }
                }
            }
        }

        System.out.println("Output :-");
        System.out.println(dp[0]);

        scn.close();
    }
}
