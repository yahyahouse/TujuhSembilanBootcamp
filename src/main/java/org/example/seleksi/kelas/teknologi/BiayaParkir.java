package org.example.seleksi.kelas.teknologi;

import java.util.Scanner;

public class BiayaParkir {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int jenisKendaraan = scanner.nextInt();
        int lamaParkir = scanner.nextInt();

        int tarifAwalMobil = 2000;
        int tarifSelanjutnyaMobil = 1000;
        int tarifAwalMotor = 1000;
        int tarifSelanjutnyaMotor = 500;
        int totalBiaya = 0;
        if (jenisKendaraan==1){
            totalBiaya=tarifAwalMobil+tarifSelanjutnyaMobil*(lamaParkir-1);
        } else if (jenisKendaraan==2) {
            totalBiaya=tarifAwalMotor+tarifSelanjutnyaMotor*(lamaParkir-1);
        }
        System.out.println(totalBiaya);
    }
}
