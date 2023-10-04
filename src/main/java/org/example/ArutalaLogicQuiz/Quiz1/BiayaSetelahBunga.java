package org.example.ArutalaLogicQuiz.Quiz1;

import java.util.Scanner;

public class BiayaSetelahBunga {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double biayaAwal = scanner.nextDouble();
        double bunga = scanner.nextDouble();
        System.out.printf("%.2f",hasilBunga(biayaAwal,bunga));

        scanner.close();
    }

    public static double hasilBunga(double biayaAwal, double bunga){
        double biayaAwalMax=150000;
        double biayaAwalMin=0;
        double bungaMax=100;
        double bungaMin=0;
        double totalBiaya=0;
        if (biayaAwal>=biayaAwalMin && biayaAwal<=biayaAwalMax && bunga>=bungaMin && bunga<=bungaMax){
            totalBiaya = biayaAwal + (biayaAwal * (bunga / 100.0));
        }
        return totalBiaya;
    }
}
