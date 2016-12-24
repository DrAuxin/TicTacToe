package com.company;

/**
 * Created by pt696 on 12/16/16.
 */
public class boardPrint {
    public String b[][];
    public int g;
    public boardPrint(String a[][])
    {
      b=a;
    }
    public void printBoard()
    {
        g = 0;
        for (int k = 0; g < 3; k++) {
            System.out.print(b[g][k] + " ");
            if (k >= 2) {
                System.out.println();
                g++;
                k = -1;
            }
        }
    }
}
