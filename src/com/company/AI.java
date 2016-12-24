package com.company;

/**
 * Created by pt696 on 12/23/16.
 */
public class AI {
    public static String move(String j[][]) {
        int type = 0;
        int danger = 2;
        int sum = 0;
        int w = 0;
        int r = 0;
        int c = 0;
        while (danger > -1) {
            sum = 0;
            type = 0;
            w = 0;
            while (w < j.length) {
                sum = sum + XO.val(j[w][w]);
                w++;
            }
            if (-sum == danger || -sum == 3)
                 if(compMove.play(j, Integer.toString(type) + Integer.toString(w - 1) + Integer.toString(w - 1)))
                    return "The computer made its move";

            type++;
            w = 0;
            sum = 0;
            while (w < j.length) {
                sum = sum + XO.val(j[2-w][w]);
                w++;
            }
            if (-sum == danger || -sum == 3)
                if(compMove.play(j, Integer.toString(type) + Integer.toString(2-w+1) + Integer.toString(w-1)))
                    return "The computer made its move";
            type++;
            sum = 0;
            for (int rr = 0; rr < j.length; rr++) { //horizontal
                for (int cc = 0; cc < j.length; cc++) {
                    sum = sum + XO.val(j[rr][cc]);
                    c = cc;
                }
                if (-sum == danger || -sum == 3)
                    if (compMove.play(j, Integer.toString(type) + Integer.toString(rr) + Integer.toString(c)))
                        return "The computer made its move";
                sum = 0;
            }
            type++;
            sum = 0;
            for (int cc = 0; cc < j.length; cc++) {
                for (int rr = 0; rr < j.length; rr++) {
                    sum = sum + XO.val(j[rr][cc]);
                    r = rr;
                }
                if (-sum == danger || -sum == 3)
                    if (compMove.play(j,Integer.toString(type) + Integer.toString(r) + Integer.toString(cc)))
                        return "The computer made its move";
                sum = 0;
            }
            sum = 0;
            type = 0;
            w = 0;
            while (w < j.length) {
                sum = sum + XO.val(j[w][w]);
                w++;
            }
            if (sum == danger || sum == 3)
                if(compMove.play(j, Integer.toString(type) + Integer.toString(w - 1) + Integer.toString(w - 1)))
            return "The computer made its move";
            type++;
            w = 0;
            sum = 0;
            while (w < j.length) {
                sum = sum + XO.val(j[2-w][w]);
                w++;
            }
            if (sum == danger || sum == 3)
                if(compMove.play(j, Integer.toString(type) + Integer.toString(2-w+1) + Integer.toString(w-1)))
            return "The computer made its move";
            type++;
            sum = 0;
            for (int rr = 0; rr < j.length; rr++) { //horizontal
                for (int cc = 0; cc < j.length; cc++) {
                    sum = sum + XO.val(j[rr][cc]);
                    c = cc;
                }
                if (sum == danger || sum == 3)
                    if (compMove.play(j, Integer.toString(type) + Integer.toString(rr) + Integer.toString(c)))
                        return "The computer made its move";
                sum = 0;
            }
            type++;
            sum = 0;
            for (int cc = 0; cc < j.length; cc++) {
                for (int rr = 0; rr < j.length; rr++) {
                    sum = sum + XO.val(j[rr][cc]);
                    r = rr;
                }
                if (sum == danger || sum == 3)
                    if (compMove.play(j,Integer.toString(type) + Integer.toString(r) + Integer.toString(cc)))
                        return "The computer made its move";
                sum = 0;
            }
            danger--;
        }
        return "Game over";
    }
}
