// Find element in an array

// Input :-
// 6 --> no. of elements
// 15
// 30
// 40
// 4
// 11
// 9
// 40 --> find

// Output :-

// 2


package arrays;

import java.util.Scanner;

public class array_01 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter input :-");

        int n = scn.nextInt();

        int arr[] = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        int k = scn.nextInt();
        int res = find(arr,k);
        System.out.println(res);

        scn.close();
    }

    public static int find(int[] arr, int k) {
        for(int idx = 0; idx < arr.length; idx++) {
            if(arr[idx] == k) {
                System.out.println("Output :-");
                return idx;
            }
        }

        return -1;
    }
}