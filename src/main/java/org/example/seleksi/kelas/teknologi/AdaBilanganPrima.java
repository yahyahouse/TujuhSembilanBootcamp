package org.example.seleksi.kelas.teknologi;

import java.util.Scanner;

public class AdaBilanganPrima {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] deret = new int[10];
        int jumlahBilanganPrima = 0;
        int jumlahBukanBilanganPrima = 0;
        for (int i = 0; i < deret.length; i++) {
            deret[i] = scanner.nextInt();
        }
        for (int angka : deret) {
            for (int i = 5; i * i <= angka; i += 6) {
                if (angka % i == 0 || angka % (i + 2) == 0) {
                    jumlahBukanBilanganPrima++;
                }
            }
            if (angka <= 3 && angka > 1) {
                jumlahBilanganPrima++;
            } else if (angka % 2 == 0 || angka % 3 == 0 || angka <= 1) {
                jumlahBukanBilanganPrima++;
            } else {
                jumlahBilanganPrima++;
            }

        }
        System.out.println(jumlahBilanganPrima);
    }
}
