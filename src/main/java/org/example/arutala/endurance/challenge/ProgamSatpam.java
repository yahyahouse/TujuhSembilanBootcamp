package org.example.arutala.endurance.challenge;

import java.util.Scanner;

public class ProgamSatpam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int noKasus = scanner.nextInt();
        int banyakKasus = scanner.nextInt();
        System.out.print(getTindakan(noKasus, banyakKasus));
        scanner.close();
    }

    public static String getTindakan(int noKasus, int banyakKasus) {
        String tindakan = "";
        switch (noKasus) {
            case 1: {
                if (banyakKasus < 4) {
                    tindakan = "Serahkan KTP anda !!!";
                } else {
                    tindakan = "Bayar Denda 10000 !!!";
                }
                break;
            }
            case 2: {
                tindakan = "Ambil STNK dulu !!!";
                break;
            }
        }
        return tindakan;
    }
}
