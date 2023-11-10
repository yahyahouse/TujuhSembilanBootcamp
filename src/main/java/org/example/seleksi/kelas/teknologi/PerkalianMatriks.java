package org.example.seleksi.kelas.teknologi;

import java.util.Arrays;
import java.util.Scanner;

public class PerkalianMatriks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int matriksA = scanner.nextInt();
        int matriksB = scanner.nextInt();
        int[][] matriks1 = new int[matriksA][matriksB];
        for (int i = 0; i < matriks1.length; i++) {
            for (int j = 0; j < matriks1[0].length; j++) {
                matriks1[i][j] = scanner.nextInt();
            }
        }
        int matriksC = scanner.nextInt();
        int matriksD = scanner.nextInt();
        int[][] matriks2 = new int[matriksC][matriksD];
        for (int i = 0; i < matriks2.length; i++) {
            for (int j = 0; j < matriks2[0].length; j++) {
                matriks2[i][j] = scanner.nextInt();
            }
        }

        Arrays.stream(calculateMatriks(matriks1, matriks2)).forEach(ints -> {
            Arrays.stream(ints).forEach(value -> System.out.print(value + " "));
            System.out.println();
        });

    }
    public static int[][] calculateMatriks(int[][] matriks1, int[][] matriks2){
        int[][] hasil = new int[matriks1.length][matriks2[0].length];
        for (int i = 0; i < matriks1.length; i++) {
            for (int j = 0; j < matriks2[0].length; j++) {
                for (int k = 0; k < matriks1[0].length; k++) {
                    hasil[i][j] += matriks1[i][k] * matriks2[k][j];
                }
            }
        }
        return hasil;
    }
}
