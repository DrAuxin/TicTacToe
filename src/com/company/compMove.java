package com.company;

/**
 * Created by Paul on 12/24/2016.
 */
public class compMove {
    public static boolean play(String[][] e, String s)
    {
        int m = Integer.valueOf(s.substring(0,1));
        int row = Integer.valueOf(s.substring(1,2));
        int column = Integer.valueOf(s.substring(2,3));
        if (m == 0) {
            for (int w = 0; w < e.length; w++) {
                if (XO.val(e[w][w]) == 0) {
                    e[w][w] = "O";
                    return true;
                }
            }
        }
        if (m == 1) {
            for (int w = 0; w < e.length; w++) {
                if (XO.val(e[2 - w][w]) == 0) {
                    e[2 - w][w] = "O";
                    return true;
                }
            }
        }
        if (m == 2) {
            for (int w = 0; w < e.length; w++) {
                if (XO.val(e[row][w]) == 0) {
                    e[row][w] = "O";
                    return true;
                }
            }
        }
        if (m == 3) {
            for (int w = 0; w < e.length; w++) {
                if (XO.val(e[w][column]) == 0) {
                    e[w][column] = "O";
                    return true;
                }
            }
        }
        return false;
        }
    }
