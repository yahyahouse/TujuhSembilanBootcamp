package org.example.arutala.endurance.challenge;

import java.util.Scanner;

public class GanjilGenapNol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int angka = scanner.nextInt();
        System.out.print(menentukanBilangan(angka));
    }

    public static String menentukanBilangan(int angka) {
        String hasil;
        if (angka == 0) {
            hasil = "nol";
        } else if (angka % 2 == 0) {
            hasil = "genap";
        } else {
            hasil = "ganjil";
        }
        return hasil;
    }
}
