// Input :-

// 6
// 6
// 0 1 4 2 8 2
// 4 3 6 5 0 4
// 1 2 4 1 4 6
// 2 0 7 3 2 2
// 3 1 5 9 2 4
// 2 7 0 8 5 1

// Output :-

// 33



package dynamicProgramming;

import java.util.Scanner;

public class goldmine {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Input :-");

        int nr = scn.nextInt();
        int nc = scn.nextInt();

        int cost[][] = new int[nr][nc];
        for(int i = 0 ; i < nr ; i++) {
            for(int j = 0 ; j < nc ; j++) {
                cost[i][j] = scn.nextInt();
            }
        }

        int dp[][] = new int[nr][nc];
        for(int c = nc-1 ; c >= 0 ; c--) {
            for(int r = nr-1 ; r >= 0 ; r--) {
                if(c == nc-1) {
                    dp[r][c] = cost[r][c];
                }
                
                else if(r == nr-1) {
                    dp[r][c] = cost[r][c] + Math.max(dp[r][c+1] , dp[r-1][c+1]);
                }
                
                else if(r == 0) {
                    dp[r][c] = cost[r][c] + Math.max(dp[r][c+1] , dp[r+1][c+1]);
                }

                else {
                    dp[r][c] = cost[r][c] + Math.max(dp[r][c+1] , Math.max(dp[r-1][c+1] , dp[r+1][c+1]));
                }
            }
        }

        int max = dp[0][0];
        for(int c = 0 , r = 0 ; r < nr ; r++) {
            if(dp[r][c] > max) {
                max = dp[r][c];
            }
        }

        System.out.println("Output :-");
        System.out.println(max);

        scn.close();
    }
}
