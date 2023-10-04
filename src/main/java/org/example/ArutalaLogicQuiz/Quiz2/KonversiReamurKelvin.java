package org.example.ArutalaLogicQuiz.Quiz2;

import java.util.Scanner;

public class KonversiReamurKelvin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double reamur = scanner.nextDouble();
        System.out.printf("%.2f", konversiSuhu(reamur));
        scanner.close();

    }

    public static double konversiSuhu(double suhuReamur) {
        double reamurMin = -273;
        double reamurMax = 80;
        double suhuKelvin = 0;
        if (suhuReamur >= reamurMin && suhuReamur <= reamurMax) {
            suhuKelvin = suhuReamur * 1.25 + 273;
        }
        return suhuKelvin;
    }
}
