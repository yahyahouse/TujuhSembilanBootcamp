package org.example.seleksi.kelas.teknologi;

import java.util.Scanner;

public class MenghitungJumlahTigaAngka {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int angka1 = scanner.nextInt();
        int angka2 = scanner.nextInt();
        int angka3 = scanner.nextInt();
        System.out.println(calculate(angka1, angka2, angka3));


    }
    public static int calculate(int angka1, int angka2, int angka3) {
        return angka1 + angka2 + angka3;
    }
}
