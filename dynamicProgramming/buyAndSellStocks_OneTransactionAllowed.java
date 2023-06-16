// Input :-

// 9 --> no. of elements in an array
// 11
// 6
// 7
// 19
// 4
// 1
// 6
// 18
// 4

// Output :-

// 17



package dynamicProgramming;

import java.util.Scanner;

public class buyAndSellStocks_OneTransactionAllowed {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Input :-");

        int n = scn.nextInt();
        int price[] = new int[n];
        for(int i = 0 ; i < n ; i++) {
            price[i] = scn.nextInt();
        }

        System.out.println("Output :-");
        System.out.println(BuyAndSellOneTransactionAllowed(price));

        scn.close();
    }

    public static int BuyAndSellOneTransactionAllowed(int price[]) {
        int bestBuy = price[0] , maxProfit = 0;
        for(int i = 1 ; i < price.length ; i++) {
            if(price[i] < bestBuy) {
                bestBuy = price[i];
            }
            else {
                if(price[i] - bestBuy > maxProfit) {
                    maxProfit = price[i] - bestBuy;
                }
            }
        }
        return maxProfit;
    }
}
