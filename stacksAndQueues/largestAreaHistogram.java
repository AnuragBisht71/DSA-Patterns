// Input :-

// 7
// 6
// 2
// 5
// 4
// 5
// 1
// 6

// Output :-

// 12

package stacksAndQueues;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class largestAreaHistogram {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Input :-");

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }
    }
}
