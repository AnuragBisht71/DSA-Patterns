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

// 30



package dynamicProgramming;

import java.util.Scanner;

public class buyAndSellStocks_InfiniteTransactionAllowed {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Input :-");

        int n = scn.nextInt();
        int price[] = new int[n];
        for (int i = 0; i < n; i++) {
            price[i] = scn.nextInt();
        }

        int bp = 0 , sp = 0 , profit = 0;
        for(int day = 1 ; day < price.length ; day++) {
            if(price[day] >= price[day-1]) {
                sp = day;
            }
            else {
                profit += price[sp] - price[bp];
                sp = bp = day;
            }
        }

        System.out.println("Output :-");
        System.out.println(profit);

        scn.close();
    }
}
