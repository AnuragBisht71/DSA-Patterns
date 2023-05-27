// Input :-

// 4

// Output :-

// 7



package dynamicProgramming;

import java.util.Scanner;

public class climb_stairs {
    public static void main(String []args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Input :-");

        int n = scn.nextInt();

        int dp[] = new int[n+1];

        for(int i = 0 ; i <= n ; i++) {
            if(i == 0) {
                dp[i] = 1;
            }
            else if(i == 1) {
                dp[i] += dp[i-1];
            }
            else if(i == 2) {
                dp[i] = dp[i-1] + dp[i-2];
            }
            else {
                dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
            }
        }

        System.out.println("Output :-");
        System.out.println(dp[n]);

        scn.close();
    } 
}
