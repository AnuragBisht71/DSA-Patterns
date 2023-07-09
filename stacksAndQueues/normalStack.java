package stacksAndQueues;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class normalStack {
    public static class CustomStack {
        int[] data;
        int tos;

        public CustomStack(int cap) {
            data = new int[cap];
            tos = -1;
        }

        int size() {
            return this.tos+1;
        }

        void display() {
            for(int i = this.tos ; i >= 0 ; i--) {
                System.out.print(this.data[i]+" ");
            }
            System.out.println();
        }

        void push(int val) {
            if(this.size() == data.length) {
                System.out.println("Stack overflow");
                return;
            }

            this.tos++;
            this.data[this.tos] = val;
        }

        int pop() {
            if(this.size() == 0) {
                System.out.println("Stack underflow");
                return -1;
            }

            int val = this.data[this.tos];
            this.data[this.tos] = 0;
            this.tos--;

            return val;
        }

        int top() {
            if(this.size() == 0) {
                System.out.println("Stack underflow");
                return -1;
            }
            return this.data[this.tos];
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Input :-");
        int n = Integer.parseInt(br.readLine());
        CustomStack st = new CustomStack(n);

        String str = br.readLine();
        while (str.equals("quit") == false) {
            if (str.startsWith("push")) {
                int val = Integer.parseInt(str.split(" ")[1]);
                st.push(val);
            } else if (str.startsWith("pop")) {
                int val = st.pop();
                if (val != -1) {
                    System.out.println(val);
                }
            } else if (str.startsWith("top")) {
                int val = st.top();
                if (val != -1) {
                    System.out.println(val);
                }
            } else if (str.startsWith("size")) {
                System.out.println(st.size());
            } else if (str.startsWith("display")) {
                st.display();
            }
            str = br.readLine();
        }
    }
}

// Input :-

// 5
// push 10
// display
// push 20
// display
// push 30
// display
// push 40
// display
// push 50
// display
// push 60
// display
// top
// pop
// display
// top
// pop
// display
// top
// pop
// display
// top
// pop
// display
// top
// pop
// display
// top
// pop
// quit

// Output :-

// 10 
// 20 10 
// 30 20 10 
// 40 30 20 10 
// 50 40 30 20 10 
// Stack overflow
// 50 40 30 20 10 
// 50
// 50
// 40 30 20 10 
// 40
// 40
// 30 20 10 
// 30
// 30
// 20 10 
// 20
// 20
// 10 
// 10
// 10

// Stack underflow
// Stack underflow


