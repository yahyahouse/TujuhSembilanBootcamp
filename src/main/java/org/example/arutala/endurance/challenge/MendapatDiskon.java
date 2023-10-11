package org.example.arutala.endurance.challenge;

import java.util.Scanner;

public class MendapatDiskon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double hargaBarang = scanner.nextDouble();
        int jumlahBarang = scanner.nextInt();
        System.out.printf("%.2f",menentukanDiskon(hargaBarang, jumlahBarang));
        scanner.close();

    }

    public static double menentukanDiskon(double hargaBarang, int jumlahBarang) {
        double diskon = 0.15;
        double totalharga = hargaBarang*jumlahBarang;
        if (jumlahBarang % 3 == 0 && jumlahBarang % 4 == 0) {
            totalharga = totalharga- totalharga*diskon;
        }
        return totalharga;
    }
}
