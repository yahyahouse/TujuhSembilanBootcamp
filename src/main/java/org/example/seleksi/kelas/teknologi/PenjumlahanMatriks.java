package org.example.seleksi.kelas.teknologi;

import java.util.Scanner;

public class PenjumlahanMatriks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matriks1 = new int[3][3];
        int[][] matriks2 = new int[3][3];
        int[][] hasil = new int[3][3];
        for (int i=0;i<matriks1.length;i++) {
            for (int j=0;j<matriks1[i].length;j++) {
                matriks1[i][j] = scanner.nextInt();
            }
        }
        for (int i=0;i<matriks2.length;i++) {
            for (int j=0;j<matriks2[i].length;j++) {
                matriks2[i][j] = scanner.nextInt();
            }
        }

        for (int i=0;i<hasil.length;i++) {
            for (int j = 0; j < hasil[i].length; j++) {
                hasil[i][j] = matriks1[i][j] + matriks2[i][j];
            }
        }
        for (int[] ints : hasil) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}
