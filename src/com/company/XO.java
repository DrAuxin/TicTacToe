package com.company;

/**
 * Created by Paul on 12/24/2016.
 */
public class XO {
    public static int val(String a) {
        if (a.equalsIgnoreCase("X"))
            return 1;
        if (a.equalsIgnoreCase("O"))
            return -1;
        else
            return 0;
    }
}
