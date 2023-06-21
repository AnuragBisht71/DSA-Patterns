// Input :-

// 5 --> no. of elements
// 1
// 2
// 3
// 4
// 5
// 3 --> no. of times it will reverse

// Output :-

// 3 4 5 1 2



package arrays;

import java.io.*;

public class rotateAnArray{
  public static void display(int[] a){
    StringBuilder sb = new StringBuilder();

    for(int val: a){
      sb.append(val + " ");
    }
    System.out.println(sb);
  }

  public static void rotate(int[] a, int k){
    int n = a.length;
    k = k % n;
    if(k < 0) {
        k = k + n;
    }
    
    reverse(a, n-k, n-1);
    reverse(a, 0, n-k-1);
    reverse(a, 0, n-1);
  }

  public static void reverse(int[] a, int lo, int hi) {
    while(lo < hi) {
        int tmp = a[lo];
        a[lo] = a[hi];
        a[hi] = tmp;

        lo++;
        hi--;
    }
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
