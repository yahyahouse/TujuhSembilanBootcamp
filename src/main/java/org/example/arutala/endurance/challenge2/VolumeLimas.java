package org.example.arutala.endurance.challenge2;

import java.util.Scanner;

public class VolumeLimas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double panjang=scanner.nextDouble();
        double lebar=scanner.nextDouble();
        double tinggi=scanner.nextDouble();

        double volume= (panjang*lebar*tinggi)/3;

        System.out.printf("%.6f",volume);
    }
}
