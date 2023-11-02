package org.example.arutala.endurance.challenge2;

import java.util.Scanner;

public class GanjilDuaDimensi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] kumpulanBilangan = new int[4][4];
        int jumlahBilanganGanjil = 0;
        for (int i = 0; i < kumpulanBilangan.length; i++) {
            for (int j = 0; j < kumpulanBilangan[i].length; j++) {
                kumpulanBilangan[i][j] = scanner.nextInt();
            }
        }

        for (int[] i : kumpulanBilangan) {
            for (int j : i) {
                if (j % 2 != 0) {
                    jumlahBilanganGanjil++;
                }
            }
        }
        System.out.print(jumlahBilanganGanjil);
    }
}
