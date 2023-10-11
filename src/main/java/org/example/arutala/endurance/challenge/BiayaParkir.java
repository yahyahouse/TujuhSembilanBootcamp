package org.example.arutala.endurance.challenge;

import java.util.Scanner;

public class BiayaParkir {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int jenisKendaraan = scanner.nextInt();
        int lamaParkir = scanner.nextInt();
        System.out.print(menghitungBiayaparkir(jenisKendaraan,lamaParkir));
    }

    public static int menghitungBiayaparkir(int jenisKendaraan, int lamaParkir) {

        int[] hargaJamPertama = {2000, 1000};
        int[] hargaJamSelanjutnya = {1000, 500};
        int hargaTotal = 0;
        for (int i = 0; i < hargaJamPertama.length; i++) {
            if (jenisKendaraan - 1 == i) {
                hargaTotal = hargaJamPertama[i] + hargaJamSelanjutnya[i] * (lamaParkir - 1);
            }
        }
        return hargaTotal;
    }
}
