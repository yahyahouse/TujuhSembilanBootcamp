package org.example.arutala.endurance.challenge2;

import java.util.Scanner;

public class TigaBola {
    public static final double phi = 3.14;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] rasio = new int[3];

        for (int i = 0; i < rasio.length; i++) {
            rasio[i] = scanner.nextInt();
        }
        double jariJari = scanner.nextDouble();

        System.out.printf("%.2f", perbandinganBola(jariJari, rasio));

        scanner.close();
    }

    public static double perbandinganBola(double jariJari, int[] perbandingan) {
        double hasilSisi = 0;
        for (int i = 0; i < perbandingan.length; i++) {
            double newSisi = jariJari * perbandingan[i] / perbandingan[0];
            hasilSisi += hitungVolumeBola(newSisi);
        }
        return hasilSisi;
    }

    public static double hitungVolumeBola(double jariJari) {
        return (double) 4 / 3 * phi * jariJari * jariJari * jariJari;
    }
}
