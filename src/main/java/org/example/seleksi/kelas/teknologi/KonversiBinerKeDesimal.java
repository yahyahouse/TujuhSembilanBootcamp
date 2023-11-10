package org.example.seleksi.kelas.teknologi;

import java.util.Scanner;

public class KonversiBinerKeDesimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String biner = scanner.nextLine();
        int desimal = 0;
        for (int i=0;i<biner.length();i++) {
            int digit = Integer.parseInt(String.valueOf(biner.charAt(i)));
            desimal += digit * Math.pow(2, biner.length()-1-i);
        }
        System.out.println(desimal);
    }
}
