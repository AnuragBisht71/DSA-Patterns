// Get Stair Paths

// Input :-

// 3

// Output :-

// [111, 12, 21, 3]



package recursion.recursionWithArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class rwal_03 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Input :-");
        
        int n = scn.nextInt();
        
        ArrayList<String> list = getStairPaths(n);
        System.out.println("Output :-");
        System.out.println(list);
        
        scn.close();
    }

    public static ArrayList<String> getStairPaths(int n) {
        if(n == 0) {
            ArrayList<String> base = new ArrayList<String>();
            base.add("");
            return base;
        }
        
        if(n < 0) {
            ArrayList<String> base = new ArrayList<String>();
            return base;
        }

        ArrayList<String> myPath = new ArrayList<>();
        ArrayList<String> path1Len = getStairPaths(n-1);
        for(String path : path1Len) {
            myPath.add("1" + path);
        }

        ArrayList<String> path2Len = getStairPaths(n-2);
        for(String path : path2Len) {
            myPath.add("2" + path);
        }

        ArrayList<String> path3Len = getStairPaths(n-3);
        for(String path : path3Len) {
            myPath.add("3" + path);
        }

        return myPath;
    }
}
