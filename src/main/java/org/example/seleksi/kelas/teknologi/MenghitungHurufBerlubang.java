package org.example.seleksi.kelas.teknologi;

import java.util.Scanner;

public class MenghitungHurufBerlubang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String kata = scanner.nextLine();

        char[] kataBerlubang1 = {'A','D','O','P','Q','R'};
        char[] kataBerlubang2 = {'B'};
        int jumlahLubang = 0;
        for (int i=0;i<kata.length();i++) {
            for (int j=0;j<kataBerlubang1.length;j++) {
                if (kata.charAt(i)==kataBerlubang1[j]) {
                    jumlahLubang++;
                }
            }
            for (int j=0;j<kataBerlubang2.length;j++) {
                if (kata.charAt(i)==kataBerlubang2[j]) {
                    jumlahLubang+=2;
                }
            }
        }
        System.out.print(jumlahLubang);
    }
}
