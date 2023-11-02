package org.example.arutala.endurance.challenge2;

import java.util.Scanner;

public class BiayaParkir {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int jenisKendaraan = scanner.nextInt();
        int lamaParkir = scanner.nextInt();
        int tarifJamPertamaMobil = 2000;
        int tarifJamSelanjutnyaMobil = 1000;
        int tarifJamPertamaMotor = 1000;
        int tarifJamSelanjutnyaMotor = 500;
        int totalTarifParkir = 0;
        switch (jenisKendaraan) {
            case 1:
                totalTarifParkir = tarifJamPertamaMobil + tarifJamSelanjutnyaMobil * (lamaParkir - 1);
                break;
            case 2:
                totalTarifParkir = tarifJamPertamaMotor + tarifJamSelanjutnyaMotor * (lamaParkir - 1);
                break;
            default:
                System.out.println("jenis kendaraan hanya 1 dan 2");
        }
        System.out.println(totalTarifParkir);
    }
}
