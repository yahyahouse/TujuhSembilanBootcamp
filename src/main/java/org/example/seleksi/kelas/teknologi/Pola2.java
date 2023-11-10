package org.example.seleksi.kelas.teknologi;

import java.util.Scanner;

public class Pola2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int angka = scanner.nextInt();
        int num = 1;

        for (int i = 1; i <= angka; i++) {
            int temp = num;
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num *= 2;
            }
            num = temp * 2;
            System.out.println();
        }
    }
}
