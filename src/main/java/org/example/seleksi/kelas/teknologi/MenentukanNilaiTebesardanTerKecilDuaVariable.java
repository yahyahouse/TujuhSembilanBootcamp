package org.example.seleksi.kelas.teknologi;

import java.util.Scanner;

public class MenentukanNilaiTebesardanTerKecilDuaVariable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int angka1 = scanner.nextInt();
        int angka2 = scanner.nextInt();
        menentukanBilanganTerbesarTerkecil(angka1, angka2);
    }
    public static void menentukanBilanganTerbesarTerkecil(int angka1, int angka2) {
        if (angka1 > angka2) {
            System.out.println(angka1 + " " + angka2);
        } else {
            System.out.println(angka2 + " " + angka1);
        }
    }
}
