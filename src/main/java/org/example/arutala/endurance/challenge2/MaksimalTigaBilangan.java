package org.example.arutala.endurance.challenge2;

import java.util.Scanner;

public class MaksimalTigaBilangan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] bilangan = new int[3];

        for (int i = 0; i < bilangan.length; i++) {
            bilangan[i] = scanner.nextInt();
        }
        int bilanganTerbesar = bilangan[0];
        for (int i = 0; i < bilangan.length; i++) {
            if (bilangan[i] > bilanganTerbesar) {
                bilanganTerbesar = bilangan[i];
            }
        }
        System.out.print(bilanganTerbesar);
    }
}
