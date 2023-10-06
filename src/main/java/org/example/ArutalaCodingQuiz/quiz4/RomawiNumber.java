package org.example.ArutalaCodingQuiz.quiz4;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class RomawiNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int angkaInput = scanner.nextInt();
        String romawi = mengubahKeRomawi(angkaInput);
        System.out.print(romawi);
    }

    public static String mengubahKeRomawi(int angkaBiasa) {
        Map<Integer, String> romawiMap = new LinkedHashMap<>();
        romawiMap.put(1000, "M");
        romawiMap.put(900, "CM");
        romawiMap.put(500, "D");
        romawiMap.put(400, "CD");
        romawiMap.put(100, "C");
        romawiMap.put(90, "XC");
        romawiMap.put(50, "L");
        romawiMap.put(40, "XL");
        romawiMap.put(10, "X");
        romawiMap.put(9, "IX");
        romawiMap.put(5, "V");
        romawiMap.put(4, "IV");
        romawiMap.put(1, "I");
        String angkaRomawi = "";
        for (Map.Entry<Integer, String> romawi : romawiMap.entrySet()) {
            int nilai = romawi.getKey();
            String simbol = romawi.getValue();
            while (angkaBiasa >= nilai) {
                angkaRomawi += simbol;
                angkaBiasa -= nilai;
            }
        }
        return angkaRomawi;
    }
}
