// Input :-

// 5
// 3
// 1
// 0
// 7
// 5

// Output :-

//                *
//                *
//                *    *
//                *    *
// *              *    *
// *              *    *
// *    *         *    *



package arrays;

import java.util.Scanner;

public class barChart {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter input :-");

        int n = scn.nextInt();

        int max = 0;
        int arr[] = new int[n];
        for(int i = 0 ; i < n ; i++) {
            arr[i] = scn.nextInt();

            if(arr[i] > max) {
                max = arr[i];
            }
        }

        int nrow = max;
        int ncol = n;

        for(int row = nrow; row >= 1; row--) {
            for(int i = 0; i < ncol; i++) {
                if(arr[i] >= row) {
                    System.out.print("*\t");
                }
                else {
                    System.out.print("\t");
                }
            }

            System.out.println();
        }

        scn.close();
    }
}
