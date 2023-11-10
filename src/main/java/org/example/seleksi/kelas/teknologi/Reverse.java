package org.example.seleksi.kelas.teknologi;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String kata = scanner.nextLine();

        for (int i=kata.length()-1;i>=0;i--) {
            System.out.print(kata.charAt(i));
        }

    }
}
