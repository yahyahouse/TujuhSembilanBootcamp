package org.example.arutala.endurance.challenge2;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class TokoTujuhSembilan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int jumlahBarang = scanner.nextInt();
        scanner.nextLine();
        String[] namaProduk = new String[jumlahBarang];
        double[] hargaProduksi = new double[jumlahBarang];
        String[] label = new String[jumlahBarang];
        for (int i = 0; i < jumlahBarang; i++) {
            namaProduk[i] = scanner.nextLine();
            label[i] = scanner.nextLine();
            hargaProduksi[i] = scanner.nextDouble();
            scanner.nextLine();
        }

        for (int i = 0; i < jumlahBarang; i++) {
            double labaPersentase = getLabaPercentage(label[i]);
            int hargaJual = (int) kalkulasiHargaJual(labaPersentase, hargaProduksi[i]);
            System.out.println(namaProduk[i]);
            System.out.println(hargaJual);
            System.out.println();
        }
    }

    public static double getLabaPercentage(String labelBarang) {
        Map<String, Double> labels = new LinkedHashMap<>();
        labels.put("Good", 0.15);
        labels.put("Recommended", 0.25);
        labels.put("Best Seller", 0.35);
        labels.put("Normal", 0.10);
        double percenLabel = 0;
        for (Map.Entry<String, Double> entry : labels.entrySet()) {
            if (labelBarang.equals(entry.getKey())) {
                percenLabel = entry.getValue();
            }

        }
        return percenLabel;
    }

    public static double kalkulasiHargaJual(double labaPercentage, double hargaProduksi) {
        return hargaProduksi + hargaProduksi * labaPercentage;
    }
}
