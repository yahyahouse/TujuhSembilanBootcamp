package org.example.seleksi.kelas.teknologi;

import java.util.Scanner;

public class MatriksNol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriks = new int[3][3];
        for (int i=0;i<3;i++) {
            for (int j=0;j<3;j++) {
                matriks[i][j] = scanner.nextInt();
            }
        }
        int cek=0;
        for (int i=0;i<3;i++) {
            for (int j=0;j<3;j++) {
                if (matriks[i][j]!=0) {
                    cek++;
                }
            }
        }
        if (cek==0) {
            System.out.println("matriks nol");
        }else {
            System.out.println("bukan matriks nol");
        }
    }
}
