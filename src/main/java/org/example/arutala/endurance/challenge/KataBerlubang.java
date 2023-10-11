package org.example.arutala.endurance.challenge;

import java.util.Scanner;

public class KataBerlubang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String kata = scanner.next();
        System.out.print(menghitungKataBerlubang(kata));
        scanner.close();
    }

    public static int menghitungKataBerlubang(String kata) {
        char[] huruf = kata.toCharArray();
        char[] arrHurufLubang1 = {'A', 'a', 'b', 'D', 'd', 'e', 'g', 'O', 'o', 'P', 'p', 'Q', 'q', 'R', '4', '6', '9', '0'};
        char[] arrHurufLubang2 = {'B', '8'};
        int jumlahHurufBerlubang = 0;

        for (char hurufs : huruf) {
            for (char c : arrHurufLubang1) {
                if (hurufs == c) {
                    jumlahHurufBerlubang++;
                }
            }
            for (char c : arrHurufLubang2) {
                if (hurufs == c) {
                    jumlahHurufBerlubang += 2;
                }
            }
        }
        return jumlahHurufBerlubang;
    }
}
