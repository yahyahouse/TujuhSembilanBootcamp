package org.example.ArutalaLogicQuiz.Quiz3;

import java.util.Scanner;

public class MesinATM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int uangDiambil = scanner.nextInt();
        double saldo = scanner.nextDouble();
        System.out.printf("%.2f",simulasiPengambilanUang(saldo,uangDiambil));
        scanner.close();

    }
    public static double simulasiPengambilanUang(double saldo, int uangDiambil){
        double sisaSaldo;
        double bunga =0.50;
        double saldoMinimum=0;
        if (uangDiambil % 5 == saldoMinimum && saldo>=(uangDiambil+bunga)) {
            sisaSaldo = saldo-uangDiambil-bunga;
        }else {
            sisaSaldo=saldo;
        }
        return sisaSaldo;
    }
}
