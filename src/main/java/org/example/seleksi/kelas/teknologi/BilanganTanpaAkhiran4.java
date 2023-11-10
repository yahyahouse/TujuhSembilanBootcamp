package org.example.seleksi.kelas.teknologi;

import java.util.Scanner;

public class BilanganTanpaAkhiran4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int angkaAwal = scanner.nextInt();
        int angkaAkhir = scanner.nextInt();

        int jumlah = calculateFour(angkaAwal, angkaAkhir);
        System.out.println(jumlah);
    }
    public static boolean isFour(int angka) {
        while (angka > 0) {
            if (angka % 10 == 4) {
                return true;
            }
            angka /= 10;
        }
        return false;
    }
    public static int calculateFour(int angkaAwal, int angkaAkhir) {
        int count = 0;
        for (int num = angkaAwal+1; num < angkaAkhir; num++) {
            if (!isFour(num)) {
                count++;
            }
        }
        return count;
    }
}
