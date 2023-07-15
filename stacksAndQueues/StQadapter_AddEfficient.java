package stacksAndQueues;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class StQadapter_AddEfficient {
    public static class StackToQueueAdapter {
        Stack<Integer> mainS;
        Stack<Integer> helperS;

        public StackToQueueAdapter() {
            mainS = new Stack<>();
            helperS = new Stack<>();
        }

        int size() {
            return this.mainS.size();
        }

        void add(int val) {
            this.mainS.push(val);
        }

        int remove() {
            if (this.mainS.size() == 0) {
                System.out.println("Queue underflow");
                return -1;
            }

            while (this.mainS.size() > 1) {
                int vl = this.mainS.pop();
                this.helperS.push(vl);
            }

            int fe = this.mainS.pop();

            while (this.helperS.size() > 0) {
                int vl = this.helperS.pop();
                this.mainS.push(vl);
            }
            return fe;
        }

        int peek() {
            if (this.mainS.size() == 0) {
                System.out.println("Queue underflow");
                return -1;
            }

            while (this.mainS.size() > 1) {
                int vl = this.mainS.pop();
                this.helperS.push(vl);
            }

            int fe = this.mainS.peek();

            while (this.helperS.size() > 0) {
                int vl = this.helperS.pop();
                this.mainS.push(vl);
            }
            return fe;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StackToQueueAdapter qu = new StackToQueueAdapter();

        String str = br.readLine();
        while (str.equals("quit") == false) {
            if (str.startsWith("add")) {
                int val = Integer.parseInt(str.split(" ")[1]);
                qu.add(val);
            } else if (str.startsWith("remove")) {
                int val = qu.remove();
                if (val != -1) {
                    System.out.println(val);
                }
            } else if (str.startsWith("peek")) {
                int val = qu.peek();
                if (val != -1) {
                    System.out.println(val);
                }
            } else if (str.startsWith("size")) {
                System.out.println(qu.size());
            }
            str = br.readLine();
        }
    }
}

// Input :-

// add 10
// add 20
// add 30
// add 40
// add 50
// remove
// remove
// add 60
// add 70
// peek
// remove
// peek
// remove
// peek
// remove
// peek
// remove
// peek
// remove
// peek
// remove
// quit

// Output :-

// 10
// 20
// 30
// 30
// 40
// 40
// 50
// 50
// 60
// 60
// 70
// 70
// Queue underflow
// Queue underflow
