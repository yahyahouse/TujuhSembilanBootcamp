package org.example.seleksi.kelas.teknologi;

import java.util.Scanner;

public class MenghitungFaktorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int angka = scanner.nextInt();
        System.out.println(calculate(angka));
    }
    public static int calculate(int angka) {
        int hasil = 1;
        for (int i = 1; i <= angka; i++) {
            hasil *= i;
        }
        return hasil;
    }
}
