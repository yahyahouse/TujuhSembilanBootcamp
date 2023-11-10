package org.example.seleksi.kelas.teknologi;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RagamJenisHuruf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String kata = scanner.nextLine().toLowerCase();

        Set<Character> uniqueCarakter = new HashSet<>();
        for (int i = 0; i < kata.length(); i++) {
            char letter = kata.charAt(i);
            if (Character.isLetter(letter)) {
                uniqueCarakter.add(letter);
            }
        }
        System.out.print(uniqueCarakter.size());
    }
}
