package org.example.learning;

import java.util.Scanner;

import java.util.Scanner;

public class Bintang {
    static String handGameResult(String player_1, String player_2) {
        String[] arr = {"ROCK", "SCISSORS", "PAPER"};
        if(player_1==player_2) {
            return "DRAW";
        } else if (player_1.equals("ROCK")&&player_2.equals("SCISSORS")||player_1.equals("SCISSORS")&&player_2.equals("PAPER")||player_1.equals("PAPER")&&player_2.equals("ROCK")) {
            return "PLAYER 1 WIN";
        } else {
            return "PLAYER 2 WIN";

        }
    }
}
