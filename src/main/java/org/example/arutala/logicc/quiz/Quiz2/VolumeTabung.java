package org.example.arutala.logicc.quiz.Quiz2;

import java.util.Scanner;

public class VolumeTabung {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double jarijari = scanner.nextDouble();
        double tinggi = scanner.nextDouble();
        System.out.printf("%.2f", menghitungVolumeTabung(jarijari,tinggi));
        scanner.close();
    }

    public static double menghitungVolumeTabung(double jariJari, double tinggi) {
        double jariJariMax = 100;
        double jariJariMin = 0;
        double tinggiMax = 100;
        double tinggiMin = 0;
        double volume = 0;

        if (jariJari >= jariJariMin && jariJari <= jariJariMax && tinggi >= tinggiMin && tinggi <= tinggiMax) {
            volume = 3.14 * jariJari * jariJari * tinggi;
        }
        return volume;
    }
}
