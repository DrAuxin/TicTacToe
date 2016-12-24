package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        int u = 1;
        int turn = 0;
        int d;
        int f;
        String reply = "";
        Scanner user = new Scanner(System.in);
	String board [][] = {{".", ".", "."},{ ".", ".", "."},{ ".", ".","."}};
        boardPrint bk = new boardPrint(board);
        bk.printBoard();
        while (!reply.equalsIgnoreCase("yes")&&!reply.equalsIgnoreCase("no")) {
            System.out.println("Will you go first?");
            reply = user.next();
        }
while (reply.equalsIgnoreCase("yes"))
{
    while (u==1) {
        System.out.println("Enter row to move to");
        d = user.nextInt() - 1;
        System.out.println("Enter column to move to");
        f = user.nextInt() - 1;
        if (Legality.legal(d, f, board))
            u = 0;
    }
    u = 1;
    String h = AI.move(board);
    System.out.println(h);
    bk.printBoard();
    if (h.equalsIgnoreCase("Game over"))
        break;
    if(boardStatus.move(board)) {
        System.out.println("Game over");
        break;
    }
}
        while (reply.equalsIgnoreCase("no"))
        {
            String h = AI.move(board);
            System.out.println(h);
            bk.printBoard();
            if(boardStatus.move(board)) {
                System.out.println("Game over");
                break;
            }
            turn++;
            if (turn > 4)
            {
                System.out.println("Game over");
                break;
            }
            while (u==1) {
                System.out.println("Enter row to move to");
                d = user.nextInt() - 1;
                System.out.println("Enter column to move to");
                f = user.nextInt() - 1;
                if (Legality.legal(d, f, board))
                    u = 0;
            }
            u = 1;
            bk.printBoard();
            if (h.equalsIgnoreCase("Game over"))
                break;
            }
        }
}
