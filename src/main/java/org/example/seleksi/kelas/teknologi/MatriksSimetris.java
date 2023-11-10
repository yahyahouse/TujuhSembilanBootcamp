package org.example.seleksi.kelas.teknologi;

import java.util.Scanner;

public class MatriksSimetris {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriks = new int[3][3];

        for (int i=0;i< matriks.length;i++) {
            for (int j=0;j< matriks[i].length;j++) {
                matriks[i][j] = scanner.nextInt();
            }
        }
        if (matriks[0][1]==matriks[1][0]&&matriks[0][2]==matriks[2][0]&&matriks[1][2]==matriks[2][1]) {
            System.out.println("matriks simetris");
        }else {
            System.out.println("bukan matriks simetris");
        }
    }
}
