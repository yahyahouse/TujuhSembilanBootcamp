package org.example.learning;

import java.util.Scanner;

public class FIzzBuzz {
    public static void main(String[] args) {
        int[] angka = new int[15];
        int nomer = 1;
        for (int i = 0; i < angka.length; i++) {
            angka[i] = nomer;
            nomer++;
        }

        menentukanFizzBuzz(angka);

    }

    public static void menentukanFizzBuzz(int[] angka) {
        String fizzBuzz = "";
        for (int i = 0; i < angka.length; i++) {
            if (angka[i] % 3 == 0 && angka[i] % 5 == 0) {
                fizzBuzz = "FizzBuzz";
            } else if (angka[i] % 3 == 0) {
                fizzBuzz = "Fizz";
            } else if (angka[i] % 5 == 0) {
                fizzBuzz = "Buzz";
            }else {
                fizzBuzz ="0";
            }
            System.out.println(fizzBuzz);
        }
    }
}
