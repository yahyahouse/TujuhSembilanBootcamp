package org.example.arutala.endurance.challenge;

import java.util.Scanner;

public class ParkirMalamMinggu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int jenisKendaraan = scanner.nextInt();
        int lamaParkir = scanner.nextInt();
        System.out.print(menghitungTarifParkir(jenisKendaraan, lamaParkir));
        scanner.close();

    }

    public static String menghitungTarifParkir(int jenisKendaraan, int lamaParkir) {
        int[] tarifParkir = {1500, 1000};
        int totalbiayaParkir = 0;
        if (isLebihDelapanJam(lamaParkir)) {
            return "disegel";
        } else {
            for (int i = 0; i < tarifParkir.length; i++) {
                if (i == jenisKendaraan - 1) {
                    totalbiayaParkir = tarifParkir[i] * lamaParkir + tambahanBiaya(lamaParkir);
                } else if (i == jenisKendaraan - 2) {
                    totalbiayaParkir = tarifParkir[i] * lamaParkir + tambahanBiaya(lamaParkir);
                }
            }
        }
        return String.valueOf(totalbiayaParkir);
    }

    public static Boolean isLebihDelapanJam(int lamaParkir) {
        Boolean lebihDelapanJam;
        if (lamaParkir > 8) {
            lebihDelapanJam = true;
        } else {
            lebihDelapanJam = false;
        }
        return lebihDelapanJam;
    }

    public static int tambahanBiaya(int lamaParkir) {
        int tambahanBiaya = 500;
        int jamTambahan = 5;
        int totalTambahan = 0;
        if (lamaParkir > 5) {
            totalTambahan = (lamaParkir - jamTambahan) * tambahanBiaya;
            return totalTambahan;
        } else {
            return totalTambahan;
        }
    }
}
