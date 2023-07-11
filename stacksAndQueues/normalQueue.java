package stacksAndQueues;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class normalQueue {
    public static class CustomQueue {
        int[] data;
        int front;
        int size;

        public CustomQueue(int cap) {
            data = new int[cap];
            front = 0;
            size = 0;
        }

        int size() {
            return this.size;
        }

        void display() {
            for(int i = 0 ; i < this.size ; i++) {
                System.out.print(data[(this.front+i)%data.length]+" ");
            }
            System.out.println();
        }
        
        void add(int val) {
            if(this.size() == data.length) {
                System.out.println("Queue overflow");
                return;
            }

            int idx = (this.front+this.size)%this.data.length;
            this.data[idx] = val;
            this.size++;
        }
        
        int remove() {
            if(this.size() == 0) {
                System.out.println("Queue overflow");
                return -1;
            }

            int val = this.data[this.front];
            this.data[this.front] = 0;
            this.front = (this.front+1)%this.data.length;
            this.size--;
            return val;
        }
        
        int peek() {
            if(this.size() == 0) {
                System.out.println("Queue overflow");
                return -1;
            }
            return this.data[this.front];
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Input :-");
        int n = Integer.parseInt(br.readLine());
        System.out.println("Output :-");
        CustomQueue qu = new CustomQueue(n);

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
            } else if (str.startsWith("display")) {
                qu.display();
            }
            str = br.readLine();
        }
    }
}


// Input :-

// 5
// add 10
// display
// add 20
// display
// add 30
// display
// add 40
// display
// add 50
// display
// add 60
// display
// peek
// remove
// display
// peek
// remove
// display
// peek
// remove
// display
// peek
// remove
// display
// peek
// remove
// display
// peek
// remove
// quit

// Output :-

// 10 
// 10 20 
// 10 20 30 
// 10 20 30 40 
// 10 20 30 40 50 
// Queue overflow
// 10 20 30 40 50 
// 10
// 10
// 20 30 40 50 
// 20
// 20
// 30 40 50 
// 30
// 30
// 40 50 
// 40
// 40
// 50 
// 50
// 50

// Queue underflow
// Queue underflow




