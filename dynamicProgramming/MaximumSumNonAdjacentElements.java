// Input :-

// 6
// 5
// 10
// 10
// 100
// 5
// 6

// Output :-

// 116



package dynamicProgramming;

import java.util.Scanner;

public class MaximumSumNonAdjacentElements {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Input :-");

        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i < n ; i++) {
            arr[i] = scn.nextInt();
        }

        int oExc = 0 , oInc = 0;

        for(int i = 0 ; i < n ; i++) {
            if(i == 0) {
                oInc = arr[0];
            }
            else {
                int nExc = Math.max(oInc, oExc);
                int nInc = arr[i] + oExc;

                oExc = nExc;
                oInc = nInc;
            }
        }

        System.out.println("Output :-");
        System.out.println(Math.max(oExc , oInc));

        scn.close();
    }    
}
