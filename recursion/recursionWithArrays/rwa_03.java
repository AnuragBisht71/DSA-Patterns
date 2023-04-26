// Max Of An Array

// Input :-

// 6
// 15
// 30
// 40
// 4
// 11
// 9

// Output :-

// 40



package recursion.recursionWithArrays;

import java.util.Scanner;

public class rwa_03 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter input :-");

        int n = scn.nextInt();

        int arr[] = new int[n];
        for(int i = 0 ; i < n ; i++) {
            arr[i] = scn.nextInt();
        }

        System.out.println("Output :-");
        System.out.println(maxOfArray(arr, 0));

        scn.close();
    }

    public static int maxOfArray(int[] arr, int idx){
        if(idx == arr.length) {
            return 0;
        }

        int res = maxOfArray(arr, idx+1);
        if(res > arr[idx]) {
            return res;
        }
        else {
            return arr[idx];
        }
    }
}
