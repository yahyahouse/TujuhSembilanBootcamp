package org.example.seleksi.kelas.teknologi;

import java.util.Scanner;

public class MenukarNilaiDuaAngka {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int angka1 = scanner.nextInt();
        int angka2 = scanner.nextInt();


        System.out.println(gantiNilaiA(angka1,angka2) + " " + gantiNilaiB(angka1,angka2));
    }
    public static int gantiNilaiA(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        return a;
    }
    public static int gantiNilaiB(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        return b;
    }
}
