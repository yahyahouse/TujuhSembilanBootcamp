package org.example.ArutalaLogicQuiz.Quiz4;

import java.util.Scanner;

public class ProgramSatpam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int noKasus = scanner.nextInt();
        int banyakKasus = scanner.nextInt();
        System.out.print(cekSebelumKeluar(noKasus,banyakKasus));
        scanner.close();
    }

    public static String cekSebelumKeluar(int noKasus,int banyakKasus){
        String tindakan ="";
        if (noKasus == 1) {
            if (banyakKasus < 4) {
                tindakan = "Serahkan KTP anda !!!";
            } else {
                tindakan = "Bayar Denda 10000 !!!";
            }
        } else if (noKasus == 2) {
            tindakan = "Ambil STNK dulu !!!";
        }
        return tindakan;
    }
}
