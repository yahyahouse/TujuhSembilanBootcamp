package org.example.learning;

public class Faktorial {
    public static void main(String[] args) {
        int angka = 10;
        int hasil = 1;
        for (int i = 1; i <= angka; i++) {
            hasil *= i;
        }
        System.out.println(hasil);
    }
}
