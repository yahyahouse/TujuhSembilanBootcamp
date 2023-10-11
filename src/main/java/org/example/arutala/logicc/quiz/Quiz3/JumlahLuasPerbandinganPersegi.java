package org.example.arutala.logicc.quiz.Quiz3;

import java.util.Scanner;

public class JumlahLuasPerbandinganPersegi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int jumlahPersegi = 3;
        int[] perbandingan = new int[jumlahPersegi];
        for (int i = 0; i < perbandingan.length; i++) {
            perbandingan[i] = scanner.nextInt();
        }
        double sisi = scanner.nextDouble();

        System.out.print(perbandinganPersegi(sisi, perbandingan));

        scanner.close();
    }
    public static double perbandinganPersegi(double sisi, int[] perbandingan) {
        double hasilSisi = 0;
        for (int i = 0; i < perbandingan.length; i++) {
            double newSisi = sisi * perbandingan[i] / perbandingan[0];
            hasilSisi += menghitungLuasPersegi(newSisi);
        }
        return hasilSisi;
    }

    public static double menghitungLuasPersegi(double sisi) {
        double luas = sisi * sisi;
        return luas;
    }
}
