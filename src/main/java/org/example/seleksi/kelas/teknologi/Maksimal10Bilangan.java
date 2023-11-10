package org.example.seleksi.kelas.teknologi;

import java.util.Scanner;

public class Maksimal10Bilangan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] bilangan = new int[10];
        for (int i=0;i< bilangan.length;i++) {
            bilangan[i] = scanner.nextInt();
        }
        int maksimal = bilangan[0];
        for (int i=1;i< bilangan.length;i++) {
            if (bilangan[i]>maksimal) {
                maksimal = bilangan[i];
            }
        }
        System.out.println(maksimal);
    }
}
