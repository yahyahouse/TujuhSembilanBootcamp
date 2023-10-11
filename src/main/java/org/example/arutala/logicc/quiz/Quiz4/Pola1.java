package org.example.arutala.logicc.quiz.Quiz4;

import java.util.Scanner;

public class Pola1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int jumlah = scanner.nextInt();
        membuatPiramida(jumlah);

    }

    public static void membuatPiramida(int jumlah) {
        for (int i = 1; i <= jumlah; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
