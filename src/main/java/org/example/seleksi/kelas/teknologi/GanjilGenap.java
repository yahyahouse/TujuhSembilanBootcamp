package org.example.seleksi.kelas.teknologi;

import java.util.Scanner;

public class GanjilGenap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int angka = scanner.nextInt();
        if (angka%2==0) {
            System.out.println("genap");
        }else {
            System.out.println("ganjil");
        }
    }
}
