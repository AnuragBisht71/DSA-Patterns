// Display Array In Reverse

// Input :-

// 5 --> No. of elements
// 3
// 1
// 0
// 7
// 5

// Output :-

// 5
// 7
// 0
// 1
// 3



package recursion.recursionWithArrays;

import java.util.Scanner;

public class rwa_02 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter input :-");

        int n = scn.nextInt();

        int arr[] = new int[n];
        for(int i = 0 ; i < n ; i++) {
            arr[i] = scn.nextInt();
        }

        System.out.println("Output :-");
        displayArrReverse(arr, 0);

        scn.close();
    }

    public static void displayArrReverse(int[] arr, int idx) {
        if(idx == arr.length) {
            return;
        }

        displayArrReverse(arr, idx+1);
        System.out.println(arr[idx]);
    }
}
