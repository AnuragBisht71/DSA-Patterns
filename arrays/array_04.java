// Rotate an array

// Input :-

// 5
// 1
// 2
// 3
// 4
// 5
// 3

// Output :-

// 3 4 5 1 2


package arrays;

import java.io.*;

public class array_04{
  public static void display(int[] a){
    StringBuilder sb = new StringBuilder();

    for(int val: a){
      sb.append(val + " ");
    }
    System.out.println(sb);
  }

  

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter input :-");

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }
    int k = Integer.parseInt(br.readLine());
    
    System.out.println("Output :-");
    rotate(a, k);
    display(a);
 }

}
