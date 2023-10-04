package org.example.liveCode;


import java.util.Scanner;

public class MengurutkanDataInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int angka1 = scanner.nextInt();
        int angka2 = scanner.nextInt();
        int angka3 = scanner.nextInt();

        if (angka1 >= -300 && angka1 <= 300 && angka2 >= -300 && angka2 <= 300 && angka3 >= -300 && angka3 <= 300) {
            int max = Math.max(angka1, Math.max(angka2, angka3));
            int min = Math.min(angka1, Math.min(angka2, angka3));
            int mid = angka1 + angka2 + angka3 - max - min;
            System.out.print(max + " " + mid + " " + min);
        }

    }
}
