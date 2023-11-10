package org.example.seleksi.kelas.teknologi;

import java.util.Scanner;

public class MenyusunBuku {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int jumlahBuku = scanner.nextInt();
        int jumlahSlotBuku = scanner.nextInt();

        int jumlahCaraPenyusunan = calculate(jumlahBuku, jumlahSlotBuku);
        System.out.println(jumlahCaraPenyusunan);
    }
    public static int calculate(int jumlahBuku, int jumlahSlotBuku) {
        int numerator = 1;
        int denominator = 1;

        for (int i = jumlahBuku; i > jumlahBuku - jumlahSlotBuku; i--) {
            numerator *= i;
        }

        for (int i = jumlahSlotBuku; i > 0; i--) {
            denominator *= i;
        }
        return numerator / denominator;
    }
}
