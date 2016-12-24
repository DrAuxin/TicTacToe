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
        System.out.println("  1 2 3");
        System.out.print("1 ");
        g = 0;
        for (int k = 0; g < 3; k++) {
            System.out.print(b[g][k] + " ");
            if (k >= 2) {
                System.out.println();
                if (g+2<4) {
                    System.out.print(g + 2 + " ");
                }
                g++;
                k = -1;
            }
        }
    }
}
