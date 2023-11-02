package org.example.arutala.endurance.challenge2;

import java.util.Scanner;

public class BiayaSetelahBunga {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double biayaAwal = scanner.nextDouble();
        double bunga = scanner.nextDouble();

        double biayaSetelahBunga = biayaAwal+biayaAwal*bunga/100;
        System.out.printf("%.2f",biayaSetelahBunga);
    }
}
