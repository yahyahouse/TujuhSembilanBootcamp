package org.example.seleksi.kelas.teknologi;

import java.util.Scanner;

public class CekTangkiBensin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int uang = scanner.nextInt();
        double kapasitas = scanner.nextDouble();
        int hargaPerliter =7600;
        double liter = (double) uang /hargaPerliter;
        if (liter>kapasitas) {
            System.out.printf("%.2f",liter);
            System.out.println();
            System.out.println("Bensin Berlebih");
        }else {
            System.out.printf("%.2f",liter);
        }
    }
}
