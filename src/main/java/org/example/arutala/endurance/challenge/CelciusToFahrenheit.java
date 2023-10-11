package org.example.arutala.endurance.challenge;

import java.util.Scanner;

public class CelciusToFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int suhuCelcius = scanner.nextInt();
        System.out.printf("%.2f",mengonversiCelciusKeFahrenheit(suhuCelcius));
        scanner.close();
    }
    public static double mengonversiCelciusKeFahrenheit(double suhuCelcius){
        double suhuFahrenheit = suhuCelcius * 1.8 + 32;
        return suhuFahrenheit;
    }
}
