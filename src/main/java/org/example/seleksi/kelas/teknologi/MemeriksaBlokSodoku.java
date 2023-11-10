package org.example.seleksi.kelas.teknologi;

import java.util.Scanner;

public class MemeriksaBlokSodoku {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriks = new int[3][3];

        for (int i=0;i< matriks.length;i++) {
            for (int j=0;j< matriks[i].length;j++) {
                matriks[i][j] = scanner.nextInt();
            }
        }
        boolean[] used = new boolean[10];
        for (int[] matrik : matriks) {
            for (int num : matrik) {
                if (num < 1 || num > 9 || used[num]) {
                    System.out.println("tidak valid");
                    return;
                }
                used[num] = true;
            }
        }
        System.out.println("valid");
    }
}
