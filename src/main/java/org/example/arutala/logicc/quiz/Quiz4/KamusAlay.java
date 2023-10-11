package org.example.arutala.logicc.quiz.Quiz4;

import java.util.Scanner;

public class KamusAlay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String kalimat = scanner.nextLine();
        gantiHurufAlay(kalimat);

    }
    public static void gantiHurufAlay(String kalimat) {
        char[] huruf = kalimat.toLowerCase().toCharArray();
        char[] asli = {'A', 'a', 'I', 'i', 'Z', 'z', 'E', 'e', 'G', 'g', 'J', 'j', 'B', 'b'};
        char[] alay = {'4', '4', '1', '1', '2', '2', '3', '3', '6', '6', '7', '7', '8', '8'};
        for (char karakter : huruf) {
            for (int i = 0; i < asli.length; i++) {
                if (karakter == asli[i]) {
                    karakter=alay[i];
                }
            }
            System.out.print(karakter);
        }

    }
}
