// All Indices Of Array

// Input :-

// 6 --> no. of elements
// 15
// 11
// 40
// 4
// 4
// 9
// 4 --> Find all indices

// Output :-

// 3
// 4



package recursion.recursionWithArrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class rwa_06 {
    public static void main(String[] args) throws Exception {
        System.out.println("Enter input :-");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int x = Integer.parseInt(br.readLine());

        System.out.println("Output :-");
        int[] iarr = allIndices(arr, x, 0, 0);

        if(iarr.length == 0){
            System.out.println();
            return;
        }

        for(int i = 0; i < iarr.length; i++){
            System.out.println(iarr[i]);
        }
    }

    public static int[] allIndices(int[] arr, int x, int idx, int fsf) {
        if(idx == arr.length) {
            return new int[fsf];
        }
        if(arr[idx] == x) {
            int a[] = allIndices(arr, x, idx+1, fsf+1);
            a[fsf] = idx;
            return a;
        }
        else {
            int a[] = allIndices(arr, x, idx+1, fsf);
            return a;
        }
    }
}
