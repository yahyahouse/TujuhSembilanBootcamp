package org.example.arutala.endurance.challenge;

import java.util.Scanner;

public class MesinATM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int jumlahTarikTunai = scanner.nextInt();
        double saldo = scanner.nextDouble();

        System.out.printf("%.2f", tarikTunai(jumlahTarikTunai, saldo));
    }

    public static double tarikTunai(int jumlahTarikTunai, double saldo) {
        double biayaTransaksi = 0.5;
        double minumumSaldo = 0;
        double kelipatanTarikTunai = 5;

        double sisaSaldo = saldo - jumlahTarikTunai - biayaTransaksi;
        if (jumlahTarikTunai % kelipatanTarikTunai == minumumSaldo && saldo >= jumlahTarikTunai + biayaTransaksi) {
            return sisaSaldo;
        } else {
            return saldo;
        }
    }
}
