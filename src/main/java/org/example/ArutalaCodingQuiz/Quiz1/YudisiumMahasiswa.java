package org.example.ArutalaCodingQuiz.Quiz1;

import java.util.Scanner;

public class YudisiumMahasiswa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int jumlahMataKuliah = scanner.nextInt();
        char[] nilaiMataKuliah = new char[jumlahMataKuliah];

        for (int i = 0; i < nilaiMataKuliah.length; i++) {
            String nilai = scanner.next().toUpperCase();
            if (nilai.length() == 1) {
                nilaiMataKuliah[i] = nilai.charAt(0);
            } else {
                System.out.println("input tidak valid");
            }
        }
        System.out.print(menentukanYudisium(nilaiMataKuliah));
        scanner.close();
    }

    public static String menentukanYudisium(char[] nilaiMataKuliah) {
        double nilaiIPK = menghitungIPK(nilaiMataKuliah);
        String hasilYudisium;
        if (nilaiIPK >= 3.5) {
            hasilYudisium = "Cum Laude";
        } else if (nilaiIPK < 3.5 && nilaiIPK >= 2.75) {
            hasilYudisium = "Sangat Memuaskan";
        } else if (nilaiIPK < 2.75 && nilaiIPK >= 2.0) {
            hasilYudisium = "Memuaskan";
        } else {
            hasilYudisium = "Pending";
        }
        return hasilYudisium;
    }

    public static double menghitungIPK(char[] nilaiMataKuliah) {
        int nilaiDalamAngka = 0;
        for (int i = 0; i < nilaiMataKuliah.length; i++) {
            if (nilaiMataKuliah[i] == 'A') {
                nilaiDalamAngka += 4;
            } else if (nilaiMataKuliah[i] == 'B') {
                nilaiDalamAngka += 3;
            } else if (nilaiMataKuliah[i] == 'C') {
                nilaiDalamAngka += 2;
            } else if (nilaiMataKuliah[i] == 'D') {
                nilaiDalamAngka += 1;
            } else if (nilaiMataKuliah[i] == 'E') {
                nilaiDalamAngka += 0;
            }
        }
        return nilaiDalamAngka / nilaiMataKuliah.length;
    }
}
