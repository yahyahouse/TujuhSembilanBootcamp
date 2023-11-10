package org.example.seleksi.kelas.teknologi;

import java.util.Scanner;

public class GanjilDuaDimensi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] angka = new int[4][4];

        int jumlahBilanganGanjil = 0;
        for(int i=0;i< angka.length;i++){
            for(int j=0;j< angka[i].length;j++){
                angka[i][j]=scanner.nextInt();
            }
        }

        for (int[] ints : angka) {
            for (int anInt : ints) {
                if (anInt % 2 == 1) {
                    jumlahBilanganGanjil++;
                }
            }
        }
        System.out.println(jumlahBilanganGanjil);
    }
}
