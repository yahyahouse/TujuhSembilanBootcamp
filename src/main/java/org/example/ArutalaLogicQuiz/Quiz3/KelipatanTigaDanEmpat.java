package org.example.ArutalaLogicQuiz.Quiz3;

import java.util.Scanner;

public class KelipatanTigaDanEmpat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int angka = scanner.nextInt();
        System.out.print(cekKelipatanTigaDanEmpat(angka));
        scanner.close();
    }

    public static int cekKelipatanTigaDanEmpat(int angka){
        int cek = 0;
        if (angka % 3 == 0 && angka % 4 == 0) {
            cek = 1;
        }
        return cek;
    }
}
