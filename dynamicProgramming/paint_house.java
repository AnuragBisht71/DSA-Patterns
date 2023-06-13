// Input :-

// 4
// 1 5 7
// 5 8 4
// 3 2 9
// 1 2 4

// Output :-

// 8



package dynamicProgramming;

import java.util.Scanner;

public class paint_house {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Input :-");

        int n = scn.nextInt();

        int arr[][] = new int[n][3];
        for(int i = 0 ; i < n ; i++) {
            arr[i][0] = scn.nextInt();
            arr[i][1] = scn.nextInt();
            arr[i][2] = scn.nextInt();
        }

        int oCostRed = arr[0][0];
        int oCostBlue = arr[0][1];
        int oCostGreen = arr[0][2];

        for(int h = 1 ; h < n ; h++) {
            int nCostRed = arr[h][0] + Math.min(oCostBlue , oCostGreen);
            int nCostBlue = arr[h][1] + Math.min(oCostRed , oCostGreen);
            int nCostGreen = arr[h][2] + Math.min(oCostRed , oCostBlue);

            oCostRed = nCostRed;
            oCostBlue = nCostBlue;
            oCostGreen = nCostGreen;
        }

        int minCost = Math.min(oCostRed , Math.min(oCostBlue , oCostGreen));

        System.out.println("Output :-");
        System.out.println(minCost);

        scn.close();
    }
}
