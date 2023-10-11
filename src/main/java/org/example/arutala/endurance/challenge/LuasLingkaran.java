package org.example.arutala.endurance.challenge;

import java.util.Scanner;

public class LuasLingkaran {
    public static final double phi =  3.14;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double jariJari = scanner.nextDouble();

        System.out.printf("%.2f",menghitungLuasLingkaran(jariJari));

    }
    public static double menghitungLuasLingkaran(double jariJari){
        return phi*jariJari*jariJari;
    }
}
