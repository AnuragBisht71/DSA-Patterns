// Get Subsequence

// Input :-

// abc

// Output :-

// [, c, b, bc, a, ac, ab, abc]



package recursion.recursionWithArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class rwal_01 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Input :-");
        
        String str = scn.nextLine();

        System.out.println("Output :-");
        ArrayList<String> al = gss(str);
        System.out.print(al);

        scn.close();
    }

    public static ArrayList<String> gss(String str) {
        if (str.length () == 0){
            ArrayList<String>  bList = new ArrayList<>();
            bList.add("");
            return bList;
        }
        
        
        ArrayList <String> mySubSeq = new ArrayList <>();
        
        char ch = str.charAt(0); //
        String roq = str.substring(1,str.length());// ros
        ArrayList<String> subSeq = gss(roq); // -- , -c, b-, bc
        
        for (String s : subSeq){
            mySubSeq.add(s);
        }
        for (String s : subSeq){
            mySubSeq.add(ch + s);
        }
        
        return mySubSeq;    
    }
}
