package org.example.arutala.endurance.challenge2;

import java.util.Scanner;

public class HurufVokal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] huruf = new String[3][3];
        for (int i = 0; i < huruf.length; i++) {
            for (int j = 0; j < huruf[i].length; j++) {
                huruf[i][j] = scanner.next();
            }
        }
        if (isHurufVokal(huruf)) {
            System.out.println("tidak ada huruf vokal");
        } else {
            getHurufVokal(huruf);
        }

    }

    public static void getHurufVokal(String[][] huruf) {
        for (int i = 0; i < huruf.length; i++) {
            for (int j = 0; j < huruf[i].length; j++) {
                if (huruf[i][j].equals("a") || huruf[i][j].equals("A")
                        || huruf[i][j].equals("i") || huruf[i][j].equals("I")
                        || huruf[i][j].equals("u") || huruf[i][j].equals("U")
                        || huruf[i][j].equals("e") || huruf[i][j].equals("E")
                        || huruf[i][j].equals("o") || huruf[i][j].equals("O")) {
                    System.out.println(huruf[i][j] + ": (" + (i + 1) + "," + (j + 1) + ")");
                }
            }
        }
    }

    public static Boolean isHurufVokal(String[][] huruf) {
        for (String[] strings : huruf) {
            for (int j = 0; j < strings.length; j++) {

                if (strings[j].equalsIgnoreCase("a")
                        || strings[j].equalsIgnoreCase("i")
                        || strings[j].equalsIgnoreCase("u")
                        || strings[j].equalsIgnoreCase("e")
                        || strings[j].equalsIgnoreCase("o")) {
                    return false;
                }
            }
        }
        return true;
    }
}
