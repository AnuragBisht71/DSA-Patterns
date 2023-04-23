// Display Array

// Input :-

// 5
// 3
// 1
// 0
// 7
// 5

// Output :-

// 3
// 1
// 0
// 7
// 5



package recursion.recursionWithArrays;

import java.util.Scanner;

public class rwa_01 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter input :-");

        int n = scn.nextInt();

        int arr[] = new int[n];
        for(int i = 0 ; i < n ; i++) {
            arr[i] = scn.nextInt();
        }

        System.out.println("Output :-");
        displayArr(arr, 0);

        scn.close();
    }

    public static void displayArr(int[] arr, int idx){
        
    }
}
