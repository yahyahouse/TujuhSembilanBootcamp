package org.example.ArutalaLogicQuiz.Quiz1;

import java.util.Scanner;

public class HitungDuaKaliLipat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int angka = scanner.nextInt();
        System.out.print(hitungAngkaDuaKaliLipat(angka));
        scanner.close();
    }

    public static int hitungAngkaDuaKaliLipat(int angka) {
        int kelipatan = 2;
        int angkaMax = 100;
        int angkaMin = 0;
        int hasil = 0;
        if (angka >= angkaMin && angka <= angkaMax) {
            hasil = angka * kelipatan;
        }
        return hasil;
    }
}
