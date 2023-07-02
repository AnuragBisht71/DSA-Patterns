// Input :-

// -+2/*6483

// Output :-

// 2
// ((2+((6*4)/8))-3)
// 264*8/+3-



package stacksAndQueues;

import java.util.Scanner;
import java.util.Stack;

public class prefixEvalAndConv {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Input :-");

        String exp = scn.nextLine();

        Stack<Integer> eval = new Stack<>();
        Stack<String> infix = new Stack<>();
        Stack<String> postfix = new Stack<>();

        for(int i = exp.length()-1 ; i >= 0 ; i--) {
            char ch = exp.charAt(i);

            if(ch >= '0' && ch <= '9') {
                eval.push(Integer.parseInt(ch+""));
                infix.push(ch+"");
                postfix.push(ch+"");
            }

            else if(ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                String inv1 = infix.pop() , inv2 = infix.pop();
                infix.push("("+inv1+ch+inv2+")");

                String postv1 = postfix.pop() , postv2 = postfix.pop();
                postfix.push(postv1+postv2+ch);

                int v1 = eval.pop() , v2 = eval.pop();
                if(ch == '+') eval.push(v1+v2);
                if(ch == '-') eval.push(v1-v2);
                if(ch == '*') eval.push(v1*v2);
                if(ch == '/') eval.push(v1/v2);
            }
        }

        System.out.println("Output :-");
        System.out.println(eval.peek()+"\n"+infix.peek()+"\n"+postfix.peek());

        scn.close();
    }
}
