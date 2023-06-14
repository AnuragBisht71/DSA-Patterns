// Input :-

// 4 3
// 1 5 7
// 5 8 4
// 3 2 9
// 1 2 4

// Output :-

// 8



package dynamicProgramming;

import java.util.Scanner;

public class paint_house_many_colors {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Input :-");

        int n = scn.nextInt();
        int m = scn.nextInt();

        int arr[][] = new int[n][m];
        for(int i = 0 ; i < n ; i++) {
            for(int j = 0 ; j < m ; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        int oCostC1 = arr[0][0];
        int oCostC2 = arr[0][1];
        int oCostC3 = arr[0][2];

        for(int h = 1 ; h < n ; h++) {
            int nCostC1 = arr[h][0] + Math.min(oCostC2 , oCostC3);
            int nCostC2 = arr[h][1] + Math.min(oCostC1 , oCostC3);
            int nCostC3 = arr[h][2] + Math.min(oCostC1 , oCostC2);

            oCostC1 = nCostC1;
            oCostC2 = nCostC2;
            oCostC3 = nCostC3;
        }

        int minCost = Math.min(oCostC1, Math.min(oCostC2 , oCostC3));
        System.out.println("Output :-");
        System.out.println(minCost);

        scn.close();
    }
}
