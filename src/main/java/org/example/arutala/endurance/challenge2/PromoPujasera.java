package org.example.arutala.endurance.challenge2;

import java.util.Scanner;

public class PromoPujasera {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double jumlahHargaMakananMinuman = scanner.nextDouble();
        int tanggalLahir = scanner.nextInt();
        double hargaTotal;
        if (jumlahHargaMakananMinuman >= 50000) {
            double diskon = 0.02;
            hargaTotal = jumlahHargaMakananMinuman-(diskon * tanggalLahir * jumlahHargaMakananMinuman);
        } else {
            hargaTotal = jumlahHargaMakananMinuman;
        }
        System.out.printf("%.2f", hargaTotal);
    }
}
