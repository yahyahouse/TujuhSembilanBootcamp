package org.example.seleksi.kelas.teknologi;

import java.util.Scanner;

public class MatriksDiagonal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriks = new int[3][3];
        for (int i=0;i< matriks.length;i++) {
            for (int j=0;j< matriks[i].length;j++) {
                matriks[i][j] = scanner.nextInt();
            }
        }
        for (int i=0;i< matriks.length;i++) {
            for (int j=0;j< matriks[i].length;j++) {
                if (i==j) {
                    if (matriks[i][j]==0) {
                        System.out.println("bukan matriks diagonal");
                        return;
                    }
                }else {
                    if (matriks[i][j]!=0) {
                        System.out.println("bukan matriks diagonal");
                        return;
                    }
                }
            }
        }
        System.out.println("matriks diagonal");
    }
}
