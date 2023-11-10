package org.example.seleksi.kelas.teknologi;

import java.util.Scanner;

public class MaksimalTigaBilangan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int angka1 = scanner.nextInt();
        int angka2 = scanner.nextInt();
        int angka3 = scanner.nextInt();

        int angkaTerbesar = angka1;
        if (angka2 > angkaTerbesar) {
            angkaTerbesar = angka2;
        } else if (angka3>angkaTerbesar) {
            angkaTerbesar = angka3;
        }
        System.out.println(angkaTerbesar);
    }
}
