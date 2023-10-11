package org.example.arutala.endurance.challenge;

import java.util.Scanner;

public class GanjilDuaDimensi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] arrBilanganPositif = new int[4][4];

        for (int i = 0; i < arrBilanganPositif.length; i++) {
            for (int j = 0; j < arrBilanganPositif[i].length; j++) {
                arrBilanganPositif[i][j] = scanner.nextInt();
            }
        }
        System.out.print(menghitungBilanganganjil(arrBilanganPositif));
        scanner.close();
    }

    public static int menghitungBilanganganjil(int[][] arrBilanganPositif) {
        int hitungBilanganganjil = 0;
        for (int i = 0; i < arrBilanganPositif.length; i++) {
            for (int j = 0; j < arrBilanganPositif[i].length; j++) {
                if (!(arrBilanganPositif[i][j] % 2 == 0)) {
                    hitungBilanganganjil++;
                }
            }
        }
        return hitungBilanganganjil;
    }
}
