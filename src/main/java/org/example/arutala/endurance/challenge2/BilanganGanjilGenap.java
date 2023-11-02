package org.example.arutala.endurance.challenge2;

import java.util.Scanner;

public class BilanganGanjilGenap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bilanganBulat = scanner.nextInt();
        if (bilanganBulat == 0) {
            System.out.print("nol");
        } else if (bilanganBulat % 2 == 0) {
            System.out.print("genap");
        } else {
            System.out.print("ganjil");
        }
    }
}
