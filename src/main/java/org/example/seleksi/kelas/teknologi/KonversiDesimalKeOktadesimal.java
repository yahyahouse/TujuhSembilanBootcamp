package org.example.seleksi.kelas.teknologi;

import java.util.Scanner;

public class KonversiDesimalKeOktadesimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int desimal = scanner.nextInt();
        StringBuilder octal = new StringBuilder();
        if (desimal == 0) {
            octal.append("0");
        } else {
            while (desimal > 0) {
                int remainder = desimal % 8;
                octal.insert(0, remainder);
                desimal = desimal / 8;
            }
        }
        System.out.println(octal);
    }
}
