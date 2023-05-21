// Sort 01

// Input :-

// 5 --> no. of elements
// 0
// 1
// 0
// 1
// 0

// Output :-

// Swapping index 0 and index 0
// Swapping index 2 and index 1
// Swapping index 4 and index 2
// 0
// 0
// 0
// 1
// 1

package timeAndSpace;

import java.util.Scanner;

public class tas_08 {
    public static void sort01(int[] arr) {
        int i = 0, j = 0;

        while (i < arr.length) {
            if (arr[i] == 1) {
                i++;
            } else {
                swap(arr, i, j);
                i++;
                j++;
            }
        }

    }

    // used for swapping ith and jth elements of array
    public static void swap(int[] arr, int i, int j) {
        System.out.println("Swapping index " + i + " and index " + j);
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Input :-");

        int n = scn.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        System.out.println("Output :-");
        sort01(arr);
        print(arr);

        scn.close();
    }
}
