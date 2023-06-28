// Input :-

// 5
// 5
// 3
// 8
// -2
// 7

// Output :-

// 8
// 8
// -1
// 7
// -1

package stacksAndQueues;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class nxtGreaterElemToTheRight {
    public static void display(int[] a) {
        StringBuilder sb = new StringBuilder();

        for (int val : a) {
            sb.append(val + "\n");
        }
        System.out.println(sb);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Input :-");
        
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        
        int[] nge = solve(arr);
        System.out.println("Output :-");
        display(nge);
    }

    public static int[] solve(int[] arr) {
        int res[] = new int[arr.length];
        res[arr.length - 1] = -1;

        Stack<Integer> st = new Stack<>();
        st.push(arr[arr.length - 1]);

        for (int i = arr.length - 2; i >= 0; i--) {
            while (st.size() > 0 && arr[i] > st.peek()) {
                st.pop();
            }

            if (st.size() == 0) {
                res[i] = -1;
            }

            else {
                res[i] = st.peek();
            }

            st.push(arr[i]);
        }

        return res;
    }
}
