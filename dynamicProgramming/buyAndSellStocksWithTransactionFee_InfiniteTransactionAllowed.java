// Input :-

// 12 --> no. of element in an array
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
// 3 --> Transaction fee

// Output :-

// 13



package dynamicProgramming;

import java.util.Scanner;

public class buyAndSellStocksWithTransactionFee_InfiniteTransactionAllowed {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Input :-");

        int n = scn.nextInt();
        int price[] = new int[n];
        for(int i = 0; i < price.length; i++) {
            price[i] = scn.nextInt();
        }

        int fee = scn.nextInt();

        int oBSP = -price[0] , oSSP = 0;

        for(int i = 1 ; i < price.length; i++) {
            int nBSP = Math.max(oBSP , oSSP - price[i]);
            int nSSP = Math.max(oSSP , price[i] - fee + oBSP);

            oBSP = nBSP;
            oSSP = nSSP;
        }

        System.out.println("Output :-");
        System.out.println(oSSP);

        scn.close();
    }
}
