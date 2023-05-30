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

// 23



package dynamicProgramming;

import java.util.Scanner;

public class min_cost_maze_traversal {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Input :-");

        int nr = scn.nextInt();
        int nc = scn.nextInt();

        int cost[][] = new int[nr][nc];
        for(int i = 0 ; i < nr ; i++) {
            for(int j = 0 ; i < nc ; j++) {
                cost[i][j] = scn.nextInt();
            }
        }

        int dp[][] = new int[nr][nc];
        for(int r = nr-1 ; r >= 0 ; r--) {
            for(int c = nc-1 ; c >= 0 ; c--) {
                if(r == nr-1 && c == nc-1) {
                    dp[r][c] = cost[r][c];
                }

                else if(r == nr-1) {
                    dp[r][c] = dp[r][c+1] + cost[r][c];
                }

                else if(c == nc-1) {
                    dp[r][c] = dp[r+1][c] + cost[r][c];
                }

                else {
                    dp[r][c] = Math.min(dp[r][c+1] , dp[r+1][c]) + cost[r][c];
                }
            }
        }

        System.out.println("Output :-");
        System.out.println(dp[0][0]);

        scn.close();
    }
}
