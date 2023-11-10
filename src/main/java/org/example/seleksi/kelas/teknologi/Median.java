package org.example.seleksi.kelas.teknologi;

import java.util.Scanner;

public class Median {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int jumlahBilangan = scanner.nextInt();
        int[] bilangan = new int[jumlahBilangan];


        double median;
        for (int i = 0; i < bilangan.length; i++) {
            bilangan[i] = scanner.nextInt();
        }
        if (bilangan.length % 2 == 0) {
            median = (double) (bilangan[bilangan.length / 2] + bilangan[(bilangan.length / 2) - 1]) / 2;
        } else {
            median = bilangan[bilangan.length / 2];
        }
        System.out.printf("%.1f",median);
    }
}
