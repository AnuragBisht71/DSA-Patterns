// Input :-

// ddddiiii

// Output :-

// 543216789



package stacksAndQueues;

import java.util.Scanner;
import java.util.Stack;

public class smallestNumFollowingPattern {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Input :-");

        String pat = scn.nextLine();

        Stack<Integer> st = new Stack<>();
        int count = 1;
        st.push(count);

        for (int i = 0; i < pat.length(); i++) {
            char ch = pat.charAt(i);

            if (ch == 'i') {
                while (st.size() > 0) {
                    System.out.print(st.pop());
                }
            }

            count++;
            st.push(count);
        }
        while (st.size() > 0) {
            System.out.print(st.pop());
        }

        scn.close();
    }
}
