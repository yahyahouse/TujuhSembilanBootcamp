package org.example.liveCode;

import java.util.Scanner;

public class TotalBiayaParkir {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int jenisKendaraan = scanner.nextInt();
        int lamaParkir = scanner.nextInt();
        int tarifAwal = 0;
        int tarifSelanjutnya = 0;
        int tarifPertamaMobil = 5000;
        int tarifPertamaMotor = 1000;
        int tarifPertamaBox = 10000;
        int tarifMaxMotor = 10000;
        int tarifMaxMobil = 25000;
        int tarifMaxBox = 50000;
        int tarifSelanjutnyaMobil =2000;
        int tarifSelanjutnyaMotor = 1500;
        int tarifSelanjutnyaBox = 5000;
        int jenisMobil = 1;
        int jenisMotor = 2;
        int jenisBox = 3;

        if (lamaParkir > 0 && lamaParkir <= 24) {
            if (jenisKendaraan == jenisMobil) {
                tarifAwal = tarifPertamaMobil;
                tarifSelanjutnya = tarifSelanjutnyaMobil;
            } else if (jenisKendaraan == jenisMotor) {
                tarifAwal = tarifPertamaMotor;
                tarifSelanjutnya = tarifSelanjutnyaMotor;
            } else if (jenisKendaraan == jenisBox) {
                tarifAwal = tarifPertamaBox;
                tarifSelanjutnya = tarifSelanjutnyaBox;
            }

            int total = tarifAwal + tarifSelanjutnya * (lamaParkir - 1);

            if (total > tarifMaxMobil && jenisKendaraan == jenisMobil) {
                total = tarifMaxMobil;
            } else if (total > tarifMaxMotor && jenisKendaraan == jenisMotor) {
                total = tarifMaxMotor;
            } else if (total > tarifMaxBox && jenisKendaraan == jenisBox) {
                total = tarifMaxBox;
            }
            System.out.print(total);

        } else {
            System.out.print("Input Error!!!");
        }


    }
}
