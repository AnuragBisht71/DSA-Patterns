// Input :-

// 5
// 15 14 10 45 30
// 2 5 1 3 4
// 7

// Output :-

// 100



package dynamicProgramming;

import java.util.Scanner;

public class unbounded_knapsack {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Input :-");

        int n = scn.nextInt();

        int vls[] = new int[n];
        for(int i = 0 ; i < vls.length ; i++) {
            vls[i] = scn.nextInt();
        }
        
        int wts[] = new int[n];
        for(int i = 0 ; i < wts.length ; i++) {
            wts[i] = scn.nextInt();
        }

        int cap = scn.nextInt();
        int dp[] = new int[cap+1];
        dp[0] = 0;

        for(int i = 1 ; i <= cap ; i++) {
            int max = 0;
            for(int j = 0 ; j < n ; j++) {
                int wt = wts[j];
                int vl = vls[j];

                if(wt <= i) {
                    int rbagc = i - wt;
                    int tbagc = dp[rbagc] + vl;

                    if(tbagc > max) {
                        max = tbagc;
                    }
                }
            }
            dp[i] = max;
        }

        System.out.println("Output :-");
        System.out.println(dp[cap]);

        scn.close();
    }
}
