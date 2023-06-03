// Input :-

// 4 --> no. of elements in an array
// 2
// 3
// 5
// 6
// 7 --> target

// Output :-

// 5



package dynamicProgramming;

import java.util.Scanner;

public class coin_change_permutation {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Input :-");

        int n = scn.nextInt();

        int coins[] = new int[n];
        for(int i = 0 ; i < coins.length ; i++) {
            coins[i] = scn.nextInt();
        }

        int tar = scn.nextInt();
        int dp[] = new int[tar+1];
        dp[0] = 1;

        for(int i = 1 ; i < dp.length ; i++) {
            for(int j = 0 ; j < coins.length ; j++) {
                int val = coins[j];
                if(val <= i) {
                    dp[i] += dp[i-val];
                }
            }
        }

        System.out.println("Output :-");
        System.out.println(dp[tar]);

        scn.close();
    }
}
