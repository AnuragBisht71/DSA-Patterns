// Get Kpc

// Input :- 78

// Output :-

// [tv, tw, tx, uv, uw, ux]



package recursion.recursionWithArrayList;

import java.util.Scanner;
import java.util.ArrayList;

public class rwal_04 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Input :-");

        String str = scn.nextLine();

        ArrayList<String> kpc = getKPC(str);
        System.out.println("Output :-");
        System.out.println(kpc);

        scn.close();
    }

    public static String keypad[] = {".;" , "abc" , "def" , "ghi" , "jkl" , "mno" , "pqrs" , "tu" , "vwx" , "yz"};

    public static ArrayList<String> getKPC(String str) {
        if(str.length() == 0) {
            ArrayList<String> bList = new ArrayList<String>();
            bList.add("");
            return bList;
        }

        char ch = str.charAt(0);
        String roq = str.substring(1);
        ArrayList<String> rres = getKPC(roq);
        String word = keypad[Integer.parseInt(ch + "")];

        ArrayList<String> list = new ArrayList<>();
        for(int idx = 0 ; idx < word.length() ; idx++) {
            for(String comb : rres) {
                list.add(word.charAt(idx) + comb);
            }
        }

        return list;
    }
}
