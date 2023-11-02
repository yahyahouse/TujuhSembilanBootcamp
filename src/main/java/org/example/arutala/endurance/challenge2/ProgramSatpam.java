package org.example.arutala.endurance.challenge2;

import java.util.Scanner;

public class ProgramSatpam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int noKasus = scanner.nextInt();
        int banyakKasus = scanner.nextInt();


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
        System.out.print(tindakan);
        scanner.close();
    }
}
