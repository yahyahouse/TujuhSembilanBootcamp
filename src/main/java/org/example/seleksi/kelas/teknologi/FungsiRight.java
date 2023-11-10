package org.example.seleksi.kelas.teknologi;

import java.util.Scanner;

public class FungsiRight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String kata = scanner.nextLine();
        char[] karakter = kata.toCharArray();
        int panjangKarakter = scanner.nextInt();

        for (int i = karakter.length-panjangKarakter; i < karakter.length; i++) {
            System.out.print(karakter[i]);
        }
    }
}
