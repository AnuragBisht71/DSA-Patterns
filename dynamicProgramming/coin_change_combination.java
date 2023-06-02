// Input :-

// 4 --> no. of elements in array
// 2
// 3
// 5
// 6
// 7 --> target

// Output :-

// 2



package dynamicProgramming;

import java.util.Scanner;

public class coin_change_combination {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Input :-");

        int n = scn.nextInt();
        int coins[] = new int[n];
        for(int i = 0 ; i < n ; i++) {
            coins[i] = scn.nextInt();
        }
        
        int tar = scn.nextInt();
        int dp[] = new int[tar+1];

        dp[0] = 1;

        for(int coin : coins) {
            for(int t = coin ; t <= tar ; t++) {
                dp[t] += dp[t-coin];
            }
        }

        System.out.println("Output :-");
        System.out.println(dp[tar]);

        scn.close();
    }
}
