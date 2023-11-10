package org.example.seleksi.kelas.teknologi;

import java.util.Scanner;

public class MenghitungNilaiPangkat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int angka = scanner.nextInt();
        int pangkat = scanner.nextInt();

        System.out.println(calculate(angka, pangkat));
    }
    public static int calculate(int angka, int pangkat) {
        int hasil = 1;
        for (int i = 0; i < pangkat; i++) {
            hasil *= angka;
        }
        return hasil;
    }
}
