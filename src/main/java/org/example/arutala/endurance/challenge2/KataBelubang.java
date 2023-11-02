package org.example.arutala.endurance.challenge2;

import java.util.Scanner;

public class KataBelubang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String kata = scanner.nextLine();
        char[] arrKata = kata.toCharArray();
        char[] arrHurufLubang1 = {'A', 'a', 'b', 'D', 'd', 'e', 'g', 'O', 'o', 'P', 'p', 'Q', 'q', 'R', '4', '6', '9', '0'};
        char[] arrHurufLubang2 = {'B', '8'};
        int jumlahHurufBerlubang = 0;
        for (char huruf: arrKata) {
            for (char hurufLubangSatu: arrHurufLubang1) {
                if (hurufLubangSatu==huruf){
                    jumlahHurufBerlubang++;
                }
            }
            for (char hurufBerlubangDua:arrHurufLubang2) {
                if (hurufBerlubangDua==huruf){
                    jumlahHurufBerlubang+=2;
                }
            }

        }
        System.out.print(jumlahHurufBerlubang);
    }
}
