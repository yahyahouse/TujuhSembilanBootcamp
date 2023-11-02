package org.example.arutala.endurance.challenge2;

import java.util.Scanner;

public class CekTangkiBensin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int jumlahUang = scanner.nextInt();
        double kapasitasTangki= scanner.nextDouble();

        int hargaPerLiter = 7600;

        double jumlahBensinMasuk = (double) jumlahUang /hargaPerLiter;
        if (kapasitasTangki<jumlahBensinMasuk){
            System.out.printf("%.2f",jumlahBensinMasuk);
            System.out.println();
            System.out.print("Bensin Berlebih");
            return;
        }
        System.out.printf("%.2f",jumlahBensinMasuk);
    }
}
