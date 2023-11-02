package org.example.arutala.endurance.challenge2;

import java.util.Scanner;

public class ParkirMalamMinggu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int jenisKendaraan = scanner.nextInt();
        int lamaParkir = scanner.nextInt();
        int tarifParkirMobil = 1500;
        int tarifParkirMotor = 1000;
        int tarifTambahanSetelahLimaJam = 500;
        int totalTarifParkir;

        if (lamaParkir > 8) {
            System.out.print("disegel");
        } else {
            int tarifAwal;
            if (jenisKendaraan == 1) {
                tarifAwal = tarifParkirMobil;
            } else {
                tarifAwal = tarifParkirMotor;
            }

            if (lamaParkir > 5) {
                totalTarifParkir = (tarifAwal * 5) + (tarifTambahanSetelahLimaJam + tarifAwal * (lamaParkir - 5));
            } else {
                totalTarifParkir = tarifAwal * lamaParkir;
            }

            System.out.print(totalTarifParkir);
        }
    }
}
