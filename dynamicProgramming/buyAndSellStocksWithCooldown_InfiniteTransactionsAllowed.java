// Input :-

// 12
// 10
// 15
// 17
// 20
// 16
// 18
// 22
// 20
// 22
// 20
// 23
// 25

// Output :-

// 19



package dynamicProgramming;

import java.util.Scanner;

public class buyAndSellStocksWithCooldown_InfiniteTransactionsAllowed {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Input :-");

        int n = scn.nextInt();
        int price[] = new int[n];
        for(int i = 0 ; i < price.length ; i++) {
            price[i] = scn.nextInt();
        }

        int oBSP = -price[0] , oSSP = 0 , oCSP = 0;

        for(int i = 1 ; i < price.length ; i++) {
            int nBSP = Math.max(oBSP , oCSP - price[i]);
            int nSSP = Math.max(oSSP , price[i] + oBSP);
            int nCSP = Math.max(oSSP , oCSP);

            oBSP = nBSP;
            oSSP = nSSP;
            oCSP = nCSP;
        }

        System.out.println("Output :-");
        System.out.println(oSSP);

        scn.close();
    }
}