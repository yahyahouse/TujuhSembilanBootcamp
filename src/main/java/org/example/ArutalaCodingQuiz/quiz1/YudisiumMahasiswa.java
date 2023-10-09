package org.example.ArutalaCodingQuiz.quiz1;

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
        if (nilaiIPK < 2.0 || nilaiIPK == 0) {
            hasilYudisium = "Pending";
        } else if (nilaiIPK >= 3.5) {
            hasilYudisium = "Cum Laude";
        } else if (nilaiIPK >= 2.75) {
            hasilYudisium = "Sangat Memuaskan";
        } else {
            hasilYudisium = "Memuaskan";
        }
        return hasilYudisium;
    }

    public static double menghitungIPK(char[] nilaiMataKuliah) {
        double nilaiDalamAngka = 0;
        for (char c : nilaiMataKuliah) {
            if (c == 'A') {
                nilaiDalamAngka += 4.0;
            } else if (c == 'B') {
                nilaiDalamAngka += 3.0;
            } else if (c == 'C') {
                nilaiDalamAngka += 2.0;
            } else if (c == 'D') {
                nilaiDalamAngka += 1.0;
            } else if (c == 'E') {
                return 0;
            }
        }
        return nilaiDalamAngka / nilaiMataKuliah.length;
    }
}
