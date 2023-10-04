package org.example.ArutalaLogicQuiz.Quiz4;

import java.util.Scanner;

public class MendapatkanDiskon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double hargaBarang = scanner.nextDouble();
        int jumlahBarang = scanner.nextInt();

        System.out.printf("%.2f", hitungDiskon(hargaBarang, jumlahBarang, totalHarga(hargaBarang, jumlahBarang)));
    }

    public static double hitungDiskon(double hargaBarang, int jumlahBarang, double totalHarga) {
        double hargaDiskon = 0;
        double diskon = 0.15;
        double hargaBarangMin = 10000;
        double hargaBarangMax = 1000000;
        double jumlahBarangMin = 1;
        double jumlahBarangMax = 100;

        if (hargaBarang >= hargaBarangMin && hargaBarang <= hargaBarangMax && jumlahBarang >= jumlahBarangMin && jumlahBarang <= jumlahBarangMax) {

            if (jumlahBarang % 3 == 0 && jumlahBarang % 4 == 0) {
                double totalDiskon = totalHarga * diskon;
                hargaDiskon = totalHarga - totalDiskon;
            } else {
                hargaDiskon = totalHarga;
            }
        }
        return hargaDiskon;
    }

    public static double totalHarga(double hargaBarang, int jumlahBarang) {
        double total = hargaBarang * jumlahBarang;
        return total;
    }
}
