package org.example.seleksi.kelas.teknologi;

import java.util.Scanner;

public class SelisihNilaiTerbesarDanTerkecil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nilai = new int[10];
        for (int i = 0; i < nilai.length; i++) {
            nilai[i] = scanner.nextInt();
        }

        int nilaiTerbesar = nilai[0];
        int nilaiTerkecil = nilai[0];
        for (int j : nilai) {
            if (j > nilaiTerbesar) {
                nilaiTerbesar = j;
            }
            if (j < nilaiTerkecil) {
                nilaiTerkecil = j;
            }
        }
        System.out.println(nilaiTerbesar - nilaiTerkecil);
    }
}
