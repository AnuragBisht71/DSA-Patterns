// Subarray Problem

// Input :-

// 3
// 10
// 20
// 30

// Output :=

// 10	
// 10	20	
// 10	20	30	
// 20	
// 20	30	
// 30	



package arrays;

import java.util.Scanner;

public class array_11 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter input :-");

        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        
        System.out.println("Output :-");
        for(int i = 0; i < n; i++) {
            for(int j = i; j < n; j++) {
                for(int idx = i; idx <= j; idx++) {
                    System.out.print(arr[idx] + "\t");
                }
                System.out.println();
            }
        }

        scn.close();
    }
}
