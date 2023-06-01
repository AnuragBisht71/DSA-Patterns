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

// 5



package dynamicProgramming;

import java.util.Scanner;

public class climbStrairsWithVar {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Input :-");

        int n = scn.nextInt();
        int moves[] = new int[n];
        for(int i = 0 ; i < moves.length ; i++) {
            moves[i] = scn.nextInt();
        }

        int dp[] = new int[n+1];
        for(int i = n ; i >= 0 ; i--) {
            if(i == n) {
                dp[i] = 1;
            }
            else {
                int maxJump = moves[i];
                for(int len = 1 ; len <= maxJump && len + i <= n ; len++) {
                    dp[i] += dp[i+len];
                }
            }
        }

        System.out.println("Output :-");
        System.out.println(dp[0]);
        
        scn.close();
        
    }
}
