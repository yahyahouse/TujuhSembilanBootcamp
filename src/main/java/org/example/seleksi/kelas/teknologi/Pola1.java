package org.example.seleksi.kelas.teknologi;

import java.util.Scanner;

public class Pola1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int angka = scanner.nextInt();

        for (int i = 0; i < angka; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}
