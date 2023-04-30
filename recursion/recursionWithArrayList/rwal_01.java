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
            ArrayList<String>  res = new ArrayList<>();
            res.add("");
            return res;
        }
        
        
        ArrayList <String> ans = new ArrayList <>();
        
        char first_ch = str.charAt(0); //
        String ros = str.substring(1,str.length());// ros
        ArrayList<String> al1 = gss(ros); // -- , -c, b-, bc
        
        for (String s : al1){
            ans.add(s);
        }
        for (String s : al1){
            ans.add(first_ch + s);
        }
        
        return ans;    
    }
}
