package org.example.seleksi.kelas.teknologi;

import java.util.Scanner;

public class Prima {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int angka = scanner.nextInt();

        for (int i = 5; i * i <= angka; i += 6) {
            if (angka % i == 0 || angka % (i + 2) == 0) {
                System.out.println("bukan prima");
                return;
            }
        }
        if (angka <= 3 && angka > 1) {
            System.out.println("prima");
        } else if (angka % 2 == 0 || angka % 3 == 0 || angka <= 1) {
            System.out.println("bukan prima");
        } else {
            System.out.println("prima");
        }
    }
}

