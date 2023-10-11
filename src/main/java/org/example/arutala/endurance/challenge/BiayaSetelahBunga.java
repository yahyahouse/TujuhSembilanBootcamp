package org.example.arutala.endurance.challenge;

import java.util.Scanner;

public class BiayaSetelahBunga {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double biayaAwal = scanner.nextDouble();
        double bunga = scanner.nextDouble();

        System.out.printf("%.2f",hitungBunga(biayaAwal,bunga));
        scanner.close();
    }
    public static double hitungBunga (double biayaAwal, double bunga){
        return biayaAwal + biayaAwal*bunga/100;
    }
}
