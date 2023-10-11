package org.example.arutala.endurance.challenge;

import java.util.Scanner;

public class VolumeLimas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double panjang = scanner.nextDouble();
        double lebar = scanner.nextDouble();
        double tinggi = scanner.nextDouble();

        System.out.printf("%.6f",menghitungVolumeLimas(panjang,lebar,tinggi));
        scanner.close();

    }

    public static double menghitungVolumeLimas(double panjang, double lebar, double tinggi) {
        return (double) 1 / 3 * panjang * lebar * tinggi;
    }
}
