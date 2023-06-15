// Input :-

// 39 --> n
// 16 --> m

// Output :-

// 61



package dynamicProgramming;

import java.util.Scanner;

public class tilingWithMinto1Tiles {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Input :-");

        int n = scn.nextInt();
        int m = scn.nextInt();

        int dp[] = new int[n+1];
        for(int i = 0 ; i <= n ; i++) {
            if(i < m) {
                dp[i] = 1;
            }
            else if(i == m) {
                dp[i] = 2;
            }
            else {
                dp[i] = dp[i-1] + dp[i-m];
            }
        }

        System.out.println("Output :-");
        System.out.println(dp[n]);

        scn.close();
    }
}
