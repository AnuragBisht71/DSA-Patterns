// Input :-

// [(a + b) + {(c + d) * (e / f)}]

// Output :-

// true



package stacksAndQueues;

import java.util.Scanner;
import java.util.Stack;

public class balancedBrackets {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Input :-");

        String exp = scn.nextLine();
        
        System.out.println("Output :-");    
        System.out.println(isBalanced(exp));    

        scn.close();
    }

    public static boolean isBalanced(String exp) {
        Stack<Character> st = new Stack<>();

        for(int i = 0 ; i < exp.length() ; i++) {
            char ch = exp.charAt(i);

            if(ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            }
            else if(ch == ')' || ch == '}' || ch == ']') {

                if(ch == ')' && st.peek() != '(') {
                    return false;
                }

                if(ch == '}' && st.peek() != '{') {
                    return false;
                }

                if(ch == ']' && st.peek() != '[') {
                    return false;
                }

                if(st.size() == 0) {
                    return false;
                }
                
                st.pop();
            }
        }

        if(st.size() != 0) {
            return false;
        }

        return true;
    }
}
