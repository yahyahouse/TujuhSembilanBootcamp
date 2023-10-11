package org.example.arutala.logicc.quiz.Quiz4;

import java.util.Scanner;

public class ParkirMalamMinggu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int jenisKendaraan = scanner.nextInt();
        int lamaParkir = scanner.nextInt();
        System.out.print(hargaParkir(jenisKendaraan, lamaParkir));
        scanner.close();
    }

    public static String hargaParkir(int jenisKendaraan, int lamaParkir) {
        int total;
        if (cekLebihDelapanJam(lamaParkir)) {
            return "disegel";
        } else {
            total = menentukanJenisKendaraan(jenisKendaraan) * lamaParkir + tambahanBiaya(lamaParkir);
            return String.valueOf(total);
        }
    }

    public static int menentukanJenisKendaraan(int jenisKendaraan) {
        int[] hargaParkirPerJam = {1500, 1000};
        int result = hargaParkirPerJam[jenisKendaraan - 1];
        return result;
    }

    public static Boolean cekLebihDelapanJam(int lamaParkir) {
        Boolean lebihDelapanJam;
        if (lamaParkir > 8) {
            lebihDelapanJam = true;
        } else {
            lebihDelapanJam = false;
        }

        return lebihDelapanJam;
    }

    public static int tambahanBiaya(int lamaParkir) {
        int limaJamSelanjutnyaMobil = 500;
        int total = 0;
        int jamTarifTambahan = 5;
        if (lamaParkir > 5) {
            total = lamaParkir - jamTarifTambahan * limaJamSelanjutnyaMobil;
            return total;
        } else {
            return total;
        }
    }
}
