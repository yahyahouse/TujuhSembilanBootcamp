package org.example.ArutalaLogicQuiz.Quiz1;

import java.util.Scanner;

public class MenampilkanSemuaBilangan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        int Y = scanner.nextInt();
        tampilkanSemuaBilangan(X,Y);
        scanner.close();
    }
    public static void tampilkanSemuaBilangan(int angka1, int angka2){
        for (int i = angka1; i <= angka2; i++) {
            if (i == angka2) {
                System.out.print(i);
            } else {
                System.out.print(i + " ");
            }
        }
    }
}
