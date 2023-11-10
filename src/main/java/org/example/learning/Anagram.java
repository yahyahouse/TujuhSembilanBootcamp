package org.example.learning;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String kata1 = "kita";
        String kata2 = "atik";

        char[] kata1Array = kata1.toCharArray();
        char[] kata2Array = kata2.toCharArray();
        Arrays.sort(kata1Array);
        Arrays.sort(kata2Array);
        System.out.println(Arrays.equals(kata1Array, kata2Array));
    }
}
