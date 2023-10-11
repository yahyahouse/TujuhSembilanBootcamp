package org.example.arutala.logicc.quiz.Quiz3;

import java.util.Scanner;

public class CekTangkiBensin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int uang = scanner.nextInt();
        double kapasitasBensin = scanner.nextDouble();
        isiBensin(uang,kapasitasBensin);
        scanner.close();

    }

    public static void isiBensin(int uangBayar, double kapasitasBensin) {
        double hargaBensin = 7600.00;
        double uangMin = 7600;
        double uangMax = 76000;
        double kapasitasBensinMin = 1;
        double kapasitasBensinMax = 10;
        double jumlahBensinDibeli;
        if (uangBayar >= uangMin && uangBayar <= uangMax && kapasitasBensin >= kapasitasBensinMin
                && kapasitasBensin <= kapasitasBensinMax) {
            jumlahBensinDibeli = uangBayar / hargaBensin;
            System.out.printf("%.2f", jumlahBensinDibeli);
            if (jumlahBensinDibeli > kapasitasBensin) {
                System.out.println();
                System.out.print("Bensin Berlebih");
            }
        }
    }
}
