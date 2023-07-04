// Input :-

// a*(b-c+d)/e

// Output :-

// abc-d+*e/
// /*a+-bcde



package stacksAndQueues;

import java.util.Scanner;
import java.util.Stack;

public class infixConversion {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Input :-");

        String exp = scn.nextLine();

        System.out.println("Ourpur :-");
        System.out.println(infixConv(exp));

        scn.close();
    }

    public static String infixConv(String exp) {
        Stack<Character> optr = new Stack<>();
        Stack<String> prefix = new Stack<>();
        Stack<String> postfix = new Stack<>();

        for(int i = 0 ; i < exp.length() ; i++) {
            char ch = exp.charAt(i);

            if(ch == '(') {
                optr.push(ch);
            }

            else if(ch == ')') {
                while(optr.peek() != '(') {
                    evaluation(optr , prefix, postfix);
                }
                optr.pop();
            }

            else if(ch >= 'a' && ch <= 'z') {
                prefix.push(ch+"");
                postfix.push(ch+"");
            }

            else if(ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                while(optr.size() > 0 && optr.peek() != '(' && precedence(ch) <= precedence(optr.peek())) {
                    evaluation(optr, prefix, postfix);
                }
                optr.push(ch);
            }
        }

        while(optr.size() > 0) {
            evaluation(optr, prefix, postfix);
        }

        return postfix.peek()+"\n"+prefix.peek();
    }

    public static void evaluation(Stack<Character> optr , Stack<String> prefix , Stack<String> postfix) {
        char op = optr.pop();

        String prev2 = prefix.pop() , prev1 = prefix.pop();
        prefix.push(op+prev1+prev2);

        String postv2 = postfix.pop() , postv1 = postfix.pop();
        postfix.push(postv1+postv2+op);
    }

    public static int precedence(char op) {
        if(op == '+') return 1;
        if(op == '-') return 1;
        if(op == '*') return 2;
        return 2;
    }
}
