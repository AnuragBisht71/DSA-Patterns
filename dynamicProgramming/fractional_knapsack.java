// Input :-

// 10
// 33 14 50 9 8 11 6 40 2 15 
// 7 2 5 9 3 2 1 10 3 3 
// 5

// Output :-

// 50.0



package dynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class fractional_knapsack {

    public static class Items implements Comparable<Items> {
        int val , wt;
        double vwr;

        public int compareTo(Items o) {
            if(o.vwr < this.vwr) {
                return -1;
            }
            else if(o.vwr == this.vwr) {
                return 0;
            }
            else {
                return 1;
            }
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Input :-");

        int n = scn.nextInt();

        int vls[] = new int[n];
        for(int i = 0 ; i < n ; i++) {
            vls[i] = scn.nextInt();
        }

        int wts[] = new int[n];
        for(int i = 0 ; i < n ; i++) {
            wts[i] = scn.nextInt();
        }

        int cap = scn.nextInt();

        Items items[] = new Items[n];

        for(int i = 0 ; i < n ; i++) {
            items[i] = new Items();
            items[i].val = vls[i];
            items[i].wt = wts[i];
            items[i].vwr = (vls[i] * 1.0) / wts[i];
        }
        Arrays.sort(items);

        int idx = 0;
        double tval = 0.0;
        while(idx < n && cap != 0) {
            if(items[idx].wt <= cap) {
                cap -= items[idx].wt;
                tval += items[idx].val;
                idx++;
            }
            else {
                tval += cap * items[idx].vwr;
                cap = 0;
            }
        }
        
        System.out.println("Output :-");
        System.out.println(tval);

        scn.close();
    }
}