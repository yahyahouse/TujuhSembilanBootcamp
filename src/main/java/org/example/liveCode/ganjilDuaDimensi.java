package org.example.liveCode;

import java.util.Scanner;

public class ganjilDuaDimensi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] angka = new int[4][4];
        int hitung = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                angka[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < angka.length; i++) {
            for (int j = 0; j < angka[i].length; j++) {
                if (angka[i][j] % 2 != 0) {
                    hitung++;
                }
            }
        }
        System.out.println(hitung);
    }
}
