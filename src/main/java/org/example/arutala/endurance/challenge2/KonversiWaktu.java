package org.example.arutala.endurance.challenge2;

import java.util.Scanner;

public class KonversiWaktu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int detik = scanner.nextInt();

        int hari = 0;
        int jam = 0;
        int menit = 0;
        while (detik > 86400) {
            hari++;
            detik -= 86400;
        }
        while (detik > 3600) {
            jam++;
            detik -= 3600;
        }
        while (detik > 60) {
            menit++;
            detik -= 60;
        }

        System.out.println(hari);
        System.out.println(jam);
        System.out.println(menit);
        System.out.print(detik);
    }
}
