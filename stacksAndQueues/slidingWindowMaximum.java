// Input :-

// 17
// 2
// 9
// 3
// 8
// 1
// 7
// 12
// 6
// 14
// 4
// 32
// 0
// 7
// 19
// 8
// 12
// 6
// 4

// Output :-

// 9
// 9
// 8
// 12
// 12
// 14
// 14
// 32
// 32
// 32
// 32
// 19
// 19
// 19

package stacksAndQueues;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class slidingWindowMaximum {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Input :-");

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int k = Integer.parseInt(br.readLine());

        int nger[] = new int[n];
        nger[n - 1] = n;

        Stack<Integer> st = new Stack<>();
        st.push(n - 1);

        for (int i = n - 2; i >= 0; i--) {
            while (st.size() > 0 && arr[i] > arr[st.peek()]) {
                st.pop();
            }

            if (st.size() == 0) {
                nger[i] = n;
            } else {
                nger[i] = st.peek();
            }

            st.push(i);
        }

        int j = 0;
        for (int i = 0; i < n - k + 1; i++) {
            if (j < i) {
                j = i;
            }

            while (nger[j] < i + k) {
                j = nger[j];
            }

            // System.out.println("Output :-");
            System.out.println(arr[j]);
        }

    }
}
