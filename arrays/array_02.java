// Span of array

// Input :-

// 6 --> no. of elements
// 15
// 30
// 40
// 4
// 11
// 9

// Output :-

// 36


package arrays;

import java.util.Scanner;

public class array_02 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter input:-");

        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        int res = spanOfArray(arr);
        System.out.println(res);

        scn.close();
    }

    public static int spanOfArray(int[] arr) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int val : arr) {
            if(val > max) {
                max = val;
            }
            
            if(val < min) {
                min = val;
            }
        }

        System.out.println("Output :-");
        return max - min;
    }
}
