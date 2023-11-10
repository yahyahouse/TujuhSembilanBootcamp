package org.example.seleksi.kelas.teknologi;

import java.util.Scanner;

public class MencariRerata {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int jumlahBilangan = scanner.nextInt();
        int[] bilangan = new int[jumlahBilangan];
        for (int i = 0; i < jumlahBilangan; i++) {
            bilangan[i] = scanner.nextInt();
        }
        int jumlah= 0;
        for (int i = 0; i < jumlahBilangan; i++) {
            jumlah += bilangan[i];
        }
        double rerata = (double) jumlah / jumlahBilangan;
        System.out.printf("%.2f",rerata);
    }
}
