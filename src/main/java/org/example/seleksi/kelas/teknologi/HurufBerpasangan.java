package org.example.seleksi.kelas.teknologi;

import java.util.Scanner;

public class HurufBerpasangan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] hurufArray = {'j', 't', 'k', 'p', 'o', 'l', 'b', 'a', 'n'};
        char huruf1 = scanner.next().toLowerCase().charAt(0);
        char huruf2 = scanner.next().toLowerCase().charAt(0);

        for (int i = 0; i < hurufArray.length-1; i++) {
            char currentChar = Character.toLowerCase(hurufArray[i]);
            char nextChar = Character.toLowerCase(hurufArray[i + 1]);
            if (currentChar== huruf2 && nextChar == huruf1) {
                System.out.println("ada");
                return;
            }
        }
        System.out.println("tidak ada");

    }
}
