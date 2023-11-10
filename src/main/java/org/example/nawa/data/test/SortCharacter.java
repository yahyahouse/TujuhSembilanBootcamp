package org.example.nawa.data.test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class SortCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String cleanedInput = str.replaceAll("\\s", "").toLowerCase();

        System.out.println("Vowel Characters : ");
        System.out.println(shortString(procVowel(cleanedInput)));
        System.out.println("Consonant Characters : ");
        System.out.println(shortString(procConsonant(cleanedInput)));
    }

    public static String procVowel(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        for (char ch : str.toLowerCase().toCharArray()) {
            if (ch == 'a' || ch == 'i' || ch == 'u' || ch == 'e' || ch == 'o') {
                stringBuilder.append(ch);
            }
        }
        return stringBuilder.toString();
    }

    public static String procConsonant(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        for (char ch : str.toLowerCase().toCharArray()) {
            if (!(ch == 'a' || ch == 'i' || ch == 'u' || ch == 'e' || ch == 'o')) {
                stringBuilder.append(ch);
            }
        }
        return stringBuilder.toString();
    }

    public static String shortString(String str) {
        Map<Character, Integer> charIndexMap = new HashMap<>();
        AtomicInteger currentIndex = new AtomicInteger();
        StringBuilder result = new StringBuilder();

        char[] charArray = str.toCharArray();
        for (char ch : charArray) {
            charIndexMap.computeIfAbsent(ch, key -> currentIndex.getAndIncrement());
            result.append(ch);
        }
        char[] resultArray = result.toString().toCharArray();

        for (int i = 0; i < resultArray.length - 1; i++) {
            for (int j = i + 1; j < resultArray.length; j++) {
                if (charIndexMap.get(resultArray[i]) > charIndexMap.get(resultArray[j])) {
                    char temp = resultArray[i];
                    resultArray[i] = resultArray[j];
                    resultArray[j] = temp;
                }
            }
        }

        return new String(resultArray);
    }
}
