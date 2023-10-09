package org.example.ArutalaCodingQuiz.quiz3;

import java.util.Scanner;

public class SandiPramuka {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().toUpperCase();
        scanner.close();

        int[] sandi = encodeToSandi(input);
        String sandiString = generateSandiString(sandi);
        System.out.println(sandiString);
    }

    private static int[] encodeToSandi(String input) {
        int jumlahHuruf = 0;
        char[] inputHuruf = input.toCharArray();

        for (int i = 0; i < inputHuruf.length; i++) {
            jumlahHuruf += getCount(inputHuruf[i]);
        }

        int[] outputAngka = new int[jumlahHuruf];
        int currentIndex = 0;
        for (int i = 0; i < inputHuruf.length; i++) {
            int sandiNumber = getSandiNumber(inputHuruf[i]);
            int count = getCount(inputHuruf[i]);
            for (int j = 0; j < count; j++) {
                outputAngka[currentIndex] = sandiNumber;
                currentIndex++;
            }
        }
        return outputAngka;
    }

    private static int getSandiNumber(char c) {
        switch (c) {
            case 'A':
                return 1;
            case 'E':
                return 2;
            case 'I':
                return 3;
            case 'M':
                return 4;
            case 'Q':
                return 5;
            case 'U':
                return 6;
            case 'Y':
                return 7;
            case 'B':
                return 1;
            case 'F':
                return 2;
            case 'J':
                return 3;
            case 'N':
                return 4;
            case 'R':
                return 5;
            case 'V':
                return 6;
            case 'Z':
                return 7;
            case 'C':
                return 1;
            case 'G':
                return 2;
            case 'K':
                return 3;
            case 'O':
                return 4;
            case 'S':
                return 5;
            case 'W':
                return 6;
            case 'D':
                return 1;
            case 'H':
                return 2;
            case 'L':
                return 3;
            case 'P':
                return 4;
            case 'T':
                return 5;
            case 'X':
                return 6;
            default:
                return 0; // Karakter tidak valid
        }
    }

    private static int getCount(char c) {
        switch (c) {
            case 'A':
            case 'E':
            case 'I':
            case 'M':
            case 'Q':
            case 'U':
            case 'Y':
                return 1;
            case 'B':
            case 'F':
            case 'J':
            case 'N':
            case 'R':
            case 'V':
            case 'Z':
                return 2;
            case 'C':
            case 'G':
            case 'K':
            case 'O':
            case 'S':
            case 'W':
                return 3;
            case 'D':
            case 'H':
            case 'L':
            case 'P':
            case 'T':
            case 'X':
                return 4;
            default:
                return 0; // Karakter tidak valid
        }
    }

    private static String generateSandiString(int[] sandi) {
        StringBuilder sandiString = new StringBuilder();
        for (int i = 0; i < sandi.length; i++) {
            sandiString.append(sandi[i]);
            if (i < sandi.length - 1 && sandi[i] == sandi[i + 1]) {
                sandiString.append("-");
            }
        }
        return sandiString.toString();
    }
}
