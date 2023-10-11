package org.example.arutala.logicc.quiz.Quiz2;

import java.util.Scanner;

public class BiayaParkir {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int jenisKendaraan = scanner.nextInt();
        int lamaParkir = scanner.nextInt();
        System.out.print(hitungBiayaParkir(jenisKendaraan,lamaParkir));
        scanner.close();
    }

    public static int hitungBiayaParkir(int jenisKendaraan, int lamaParkir){
        int tarifJamPertamaMobil=2000;
        int tarifJamPertamaMotor=1000;
        int tarifJamSelanjutnyaMobil=1000;
        int tarifJamSelanjutnyaMotor=500;
        int mobil =1;
        int motor =2;
        int total=0;
        if (jenisKendaraan==mobil){
            total = tarifJamPertamaMobil + (lamaParkir-1)*tarifJamSelanjutnyaMobil;
        } else if (jenisKendaraan==motor) {
            total = tarifJamPertamaMotor + (lamaParkir-1)*tarifJamSelanjutnyaMotor;
        }
        return total;
    }
}
