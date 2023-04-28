// Last Index

// Input :-

// 6 --> no. of element
// 15
// 11
// 40
// 4
// 4
// 9
// 4 --> Find last index

// Output :-

// 4



package recursion.recursionWithArrays;

import java.util.Scanner;

public class rwa_05 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter input :-");

        int n = scn.nextInt();
        
        int arr[] = new int[n];
        for(int i = 0 ; i < n ; i++) {
            arr[i] = scn.nextInt();
        }
        
        int x = scn.nextInt();
        System.out.println("Output :-");
        System.out.println(lastIndex(arr, 0 , x));

        scn.close();
    }

    public static int lastIndex(int[] arr, int idx, int x){
        if(idx == arr.length) {
            return -1;
        }

        int res = lastIndex(arr, idx+1, x);

        if(res == -1) {
            if(arr[idx] == x) {
                return idx;
            }
            else {
                return -1;
            }
        }
        else {
            return res;
        }
    }
}


