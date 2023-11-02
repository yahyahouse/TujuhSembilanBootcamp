package org.example.arutala.endurance.challenge2;

import java.util.Scanner;

public class MesinATM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int jumlahTarikTunai = scanner.nextInt();
        double saldoAwal = scanner.nextDouble();
        double biayaTransaksi = 0.5;
        double sisaSaldo;

        if (jumlahTarikTunai % 5 == 0 && saldoAwal >= jumlahTarikTunai + biayaTransaksi) {
            sisaSaldo = saldoAwal - jumlahTarikTunai - biayaTransaksi;
        } else {
            sisaSaldo = saldoAwal;
        }
        System.out.printf("%.2f", sisaSaldo);
    }
}
