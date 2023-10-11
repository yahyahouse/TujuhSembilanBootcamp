package org.example.arutala.endurance.challenge;

import java.util.Scanner;

public class GanjilGenap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bilangan = scanner.nextInt();
        System.out.print(menentukanGanjilGenap(bilangan));
        scanner.close();
    }

    public static String menentukanGanjilGenap(int bilangan) {
        String jenisBilangan;
        if (bilangan % 2 == 0) {
            jenisBilangan = "genap";
        } else {
            jenisBilangan = "ganjil";
        }

        return jenisBilangan;
    }
}
