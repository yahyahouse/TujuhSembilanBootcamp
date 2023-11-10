package org.example.seleksi.kelas.teknologi;

import java.util.Scanner;

public class KPKdariDuaVariable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int angkaA = scanner.nextInt();
        int angkaB = scanner.nextInt();
        int A = angkaA;
        int B = angkaB;
        while (angkaB != 0) {
            int temp = angkaB;
            angkaB = angkaA % angkaB;
            angkaA = temp;
        }
        int fpb = angkaA;
        int kpk = (A * B) / fpb;
        System.out.println(kpk);
    }
}
