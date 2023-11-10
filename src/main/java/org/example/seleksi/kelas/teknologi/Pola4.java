package org.example.seleksi.kelas.teknologi;

import java.util.Scanner;

public class Pola4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int angkaB = scanner.nextInt();
        int angkaK = scanner.nextInt();
        int[][] matriks = new int[angkaB][angkaK];

        int counter = 1;
        for(int i = 0; i < angkaB; i++){
            if (i % 2 == 0) {
                for (int j = 0; j < angkaK; j++) {
                    matriks[i][j] = counter++;
                }
            } else {
                for (int j = angkaK - 1; j >= 0; j--) {
                    matriks[i][j] = counter++;
                }
            }
        }
        for (int i = 0; i < angkaB; i++) {
            for (int j = 0; j < angkaK; j++) {
                System.out.print(matriks[i][j] + " ");
            }
            System.out.println();
        }
    }
}
