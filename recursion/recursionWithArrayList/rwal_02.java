// Get Maze Paths

// Input :-

// 3
// 3

// Output :-

// [hhvv, hvhv, hvvh, vhhv, vhvh, vvhh]



package recursion.recursionWithArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class rwal_02 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Input :-");

        int nr = scn.nextInt();
        int nc = scn.nextInt();

        ArrayList<String> path = getMazePaths(0,0,nr-1,nc-1);
        System.out.println("Output :-");
        System.out.println(path);

        scn.close();
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        if(sr == dr && sc == dc) {
            ArrayList<String> blist = new ArrayList<>();
            blist.add("");
            return blist;
        }
        
        ArrayList<String> myPath = new ArrayList<>();
        if(sc+1 <= dc) {
            ArrayList<String> hPath = getMazePaths(sr, sc+1, dr, dc);
            for(String path : hPath) {
                myPath.add("h" + path);
            }
        }
        
        if(sr+1 <= dr) {
            ArrayList<String> vPath = getMazePaths(sr+1, sc, dr, dc);
            for(String path : vPath) {
                myPath.add("v" + path);
            }
        }

        return myPath;
    }
}
