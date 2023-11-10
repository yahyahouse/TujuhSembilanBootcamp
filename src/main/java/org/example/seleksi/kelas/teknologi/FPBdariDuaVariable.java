package org.example.seleksi.kelas.teknologi;

import java.util.Scanner;

public class FPBdariDuaVariable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int angkaA = scanner.nextInt();
        int angkaB = scanner.nextInt();

        while (angkaB != 0) {
            int temp = angkaB;
            angkaB = angkaA % angkaB;
            angkaA = temp;
        }
        System.out.println(angkaA);
    }
}
