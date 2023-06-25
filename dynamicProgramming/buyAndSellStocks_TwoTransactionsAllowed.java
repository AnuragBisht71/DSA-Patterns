// Input :-

// 9
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

// 30



package dynamicProgramming;

import java.util.Scanner;

public class buyAndSellStocks_TwoTransactionsAllowed {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Input :-");

        int n = scn.nextInt();
        int price[] = new int[n];
        for(int i = 0 ; i < price.length ; i++) {
            price[i] = scn.nextInt();
        }

        System.out.println("Output :-");
        System.out.println(buyAndSellStocksTwoTransactionsAllowed(price));

        scn.close();
    }

    public static int buyAndSellStocksTwoTransactionsAllowed(int[] price) {
        int pBD[] = profitConsideringBuyingDay(price);
        int pSD[] = profitConsideringSellingDay(price);

        for(int i = price.length - 2 ; i >= 0 ; i--) {
            pBD[i] = Math.max(pBD[i], pBD[i+1]);
        }

        for(int i = 1 ; i < price.length ; i++) {
            pSD[i] = Math.max(pSD[i], pSD[i-1]);
        }

        int omax = 0;

        for(int i = 0 ; i < price.length ; i++) {
            omax = Math.max(omax , pBD[i] + pSD[i]);
        }

        return omax;
    }

    public static int[] profitConsideringBuyingDay(int[] price) {
        int res[] = new int[price.length];
        int bestSell = price[price.length-1];

        for(int i = price.length-2 ; i >= 0 ; i--) {
            if(price[i] > bestSell) {
                bestSell = price[i];
            }
            else {
                res[i] = bestSell - price[i];
            }
        }

        return res;
    }

    public static int[] profitConsideringSellingDay(int[] price) {
        int res[] = new int[price.length];
        int bestBuy = price[0];

        for(int i = 1 ; i < price.length ; i++) {
            if(price[i] < bestBuy) {
                bestBuy = price[i];
            }
            else {
                res[i] = price[i] - bestBuy;
            }
        }

        return res;
    }
}