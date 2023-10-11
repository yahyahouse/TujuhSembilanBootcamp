package org.example.arutala.endurance.challenge;

import java.util.Scanner;

public class HurufBerlubang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String kalimat = scanner.nextLine();

        System.out.print(menghitungHurufBerlubang(kalimat));
        scanner.close();
    }

    public static int menghitungHurufBerlubang(String kalimat) {
        char[] arrHuruf = kalimat.toUpperCase().toCharArray();
        int jumlahBerlubang = 0;

        char[] arrHurufLubangSatu = {'A', 'D', 'O', 'P', 'Q', 'R'};
        char hurufLubangDua = 'B';

        for (int i = 0; i < arrHuruf.length; i++) {
            for (char huruf1 : arrHurufLubangSatu) {
                if (arrHuruf[i] == huruf1) {
                    jumlahBerlubang++;
                }
            }
            if (arrHuruf[i] == hurufLubangDua) {
                jumlahBerlubang += 2;
            }
        }
        return jumlahBerlubang;
    }
}
