package com.company;

/**
 * Created by Paul on 12/24/2016.
 */
public class Legality {
    public static boolean legal(int l, int p, String q[][])
    {
        if (l >= 0 && l <= 2 && p >= 0 && p <= 2)
            if (XO.val(q[l][p]) == 0) {
                q[l][p] = "X";
                return true;
            }
        System.out.println("Illegal move");
        return false;
    }
}
