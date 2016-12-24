package com.company;

/**
 * Created by Paul on 12/24/2016.
 */
public class boardStatus {

    public static boolean move(String j[][]) {
        int sum = 0;
        int w = 0;
        while (w < j.length) {
            sum = sum + XO.val(j[w][w]);
            w++;
        }
        if (Math.abs(sum) == 3)
            return true;
        w = 0;
        sum = 0;
        while (w < j.length) {
            sum = sum + XO.val(j[2 - w][w]);
            w++;
        }
        if (Math.abs(sum) == 3)
            return true;
        sum = 0;
        for (int rr = 0; rr < j.length; rr++) { //horizontal
            for (int cc = 0; cc < j.length; cc++) {
                sum = sum + XO.val(j[rr][cc]);
            }
            if (Math.abs(sum) == 3)
                return true;
            sum = 0;
        }
        sum = 0;
        for (int cc = 0; cc < j.length; cc++) {
            for (int rr = 0; rr < j.length; rr++) {
                sum = sum + XO.val(j[rr][cc]);
            }
            if (Math.abs(sum) == 3)
                return true;
            sum = 0;
        }
        return false;
    }
}
