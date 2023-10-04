package org.example.ArutalaLogicQuiz.Quiz2;

import java.util.Scanner;

public class LuasLingkaran {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double jariJari = scanner.nextDouble();
        int jumlahLingkaran = scanner.nextInt();
        System.out.printf("%.2f", menghitungLuasLingkaran(jariJari, jumlahLingkaran));
        scanner.close();
    }

    public static double menghitungLuasLingkaran(double jarijari, int jumlahLingkaran) {
        double totalLuasLingkaran = 0;
        double jariJariMax = 100;
        double jariJariMin = 0;
        double jumlahLingkaranMax = 50;
        double jumlahLingkaranMin = 0;
        if (jarijari > jariJariMin && jarijari <= jariJariMax && jumlahLingkaran > jumlahLingkaranMin
                && jumlahLingkaran <= jumlahLingkaranMax) {
            double luasLingkaran = 3.14 * jarijari * jarijari;
            totalLuasLingkaran = jumlahLingkaran * luasLingkaran;
        }
        return totalLuasLingkaran;
    }
}
