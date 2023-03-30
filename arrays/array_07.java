// Inverse of an array

// Input :-

// 5 --> no. of elements
// arr[] = [4, 0, 2, 3, 1];

// Output :-

// res[] = [1, 4, 2, 3, 0];


package arrays;

import java.io.*;

public class array_07{
  public static void display(int[] a){
    StringBuilder sb = new StringBuilder();

    for(int val: a){
      sb.append(val + "\n");
    }
    System.out.println(sb);
  }

  public static int[] inverse(int[] a){
    int res[] = new int[a.length];
    for(int idx = 0; idx < a.length; idx++) {
      int val = a[idx];
      res[val] = idx;
    }
    return res;
  }

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter input :-");

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }
    
    System.out.println("Output :-");
    int[] inv = inverse(a);
    display(inv);
 }

}
