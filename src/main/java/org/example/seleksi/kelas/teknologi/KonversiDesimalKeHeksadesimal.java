package org.example.seleksi.kelas.teknologi;

import java.util.Scanner;

public class KonversiDesimalKeHeksadesimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int desimal = scanner.nextInt();

        String hexDigits = "0123456789ABCDEF";
        StringBuilder hexadecimal = new StringBuilder();
        if (desimal == 0) {
            hexadecimal.append("0");
        } else {
            while (desimal > 0) {
                int remainder = desimal % 16;
                hexadecimal.insert(0, hexDigits.charAt(remainder));
                desimal = desimal / 16;
            }
        }
        System.out.println(hexadecimal);
    }
}
