package org.example.arutala.endurance.challenge2;

import java.util.Scanner;

public class KonversiCelciusKeFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double suhuCelcius = scanner.nextDouble();
        double suhuFahrenheit = suhuCelcius *1.8 + 32;

        System.out.printf("%.2f",suhuFahrenheit);

    }
}
