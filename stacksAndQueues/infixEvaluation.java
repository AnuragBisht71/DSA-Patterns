// Input :-

// 2 + 6 * 4 / 8 - 3

// Output :-

// 2



package stacksAndQueues;

import java.util.Scanner;
import java.util.Stack;

public class infixEvaluation {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Input :-");

        String exp = scn.nextLine();
        
        System.out.println("Output :-");
        System.out.println(infixEval(exp));

        scn.close();
    }

    public static int infixEval(String exp) {
        Stack<Integer> opnd = new Stack<>();
        Stack<Character> optr = new Stack<>();

        for(int i = 0 ; i < exp.length() ; i++) {
            char ch = exp.charAt(i);

            if(ch == '(') {
                optr.push(ch);
            }

            else if(ch == ')') {
                while(optr.peek() != '(') {
                    evaluation(opnd, optr);
                }
                optr.pop();
            }

            else if(ch >= '0' && ch <= '9') {
                opnd.push(Integer.parseInt(ch+""));
            }

            else if(ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                while(optr.size() > 0 && optr.peek() != '(' && precedence(ch) <= precedence(optr.peek())) {
                    evaluation(opnd, optr);
                }
                optr.push(ch);
            }
        }

        while(optr.size() > 0) {
            evaluation(opnd, optr);
        }

        return opnd.peek();
    }

    public static void evaluation(Stack<Integer> opnd , Stack<Character> optr) {
        char op = optr.pop();
        int v2 = opnd.pop() , v1 = opnd.pop();

        if(op == '+') opnd.push(v1+v2);
        else if(op == '-') opnd.push(v1-v2);
        else if(op == '*') opnd.push(v1*v2);
        else if(op == '/') opnd.push(v1/v2);
    }

    public static int precedence(char op) {
        if(op == '+') return 1;
        if(op == '-') return 1;
        if(op == '*') return 2;
        return 2;
    }
}
