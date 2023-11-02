package org.example.arutala.endurance.challenge2;

import java.util.Scanner;

public class CekHurufVokal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String huruf = scanner.next();

        System.out.println(huruf.equalsIgnoreCase("a")
                || huruf.equalsIgnoreCase("i")
                || huruf.equalsIgnoreCase("u")
                || huruf.equalsIgnoreCase("e")
                || huruf.equalsIgnoreCase("o"));
    }
}
