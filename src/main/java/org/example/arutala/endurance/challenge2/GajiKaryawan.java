package org.example.arutala.endurance.challenge2;

import java.text.DecimalFormat;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class GajiKaryawan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String posisi = scanner.nextLine();
        String divisi = scanner.next();

        System.out.println(posisi);
        System.out.println(divisi);
        System.out.println("22 hari");
        System.out.println(formatCurrency(calculateGajiBersih(posisi, divisi)));
    }

    public static String formatCurrency(double nilai) {
        if (nilai == 0) {
            return "0.00";
        } else {
            DecimalFormat convert = new DecimalFormat("###,###,###,###.00");
            return convert.format(nilai);
        }
    }

    public static double getGajiPokok(String divisi, String posisi) {

        Map<String, Integer> posisis = new LinkedHashMap<>();
        posisis.put("Software Engineer", 0);
        posisis.put("Data Analyst", 1);
        posisis.put("UX Designer", 2);
        posisis.put("Project Manager", 3);
        posisis.put("QA Engineer", 4);

        Map<String, Integer> divisis = new LinkedHashMap<>();
        divisis.put("Surabaya", 0);
        divisis.put("Jakarta", 1);
        divisis.put("Bandung", 2);
        divisis.put("Medan", 3);
        divisis.put("Makassar", 4);

        double[][] gajiPokok = {
                {8_000_000, 9_000_000, 7_500_000, 7_200_000, 8_500_000},
                {7_000_000, 8_000_000, 6_500_000, 6_200_000, 7_500_000},
                {7_500_000, 8_500_000, 7_000_000, 6_800_000, 8_000_000},
                {10_000_000, 11_000_000, 9_500_000, 9_200_000, 10_500_000},
                {7_500_000, 8_500_000, 7_000_000, 6_800_000, 8_000_000}
        };
        int posisiInteger = 0;
        for (Map.Entry<String, Integer> entry : posisis.entrySet()) {
            if (posisi.equals(entry.getKey())) {
                posisiInteger = entry.getValue();
            }
        }
        int divisiInteger = 0;
        for (Map.Entry<String, Integer> entry : divisis.entrySet()) {
            if (divisi.equals(entry.getKey())) {
                divisiInteger = entry.getValue();
            }
        }
        return gajiPokok[posisiInteger][divisiInteger];
    }

    public static double getTunjanganTransport(String divisi) {
        Map<String, Double> divisis = new LinkedHashMap<>();
        divisis.put("Surabaya", 1_000_000.0);
        divisis.put("Jakarta", 1_500_000.0);
        divisis.put("Bandung", 1_200_000.0);
        divisis.put("Medan", 1_100_000.0);
        divisis.put("Makassar", 1_300_000.0);
        double tunjangan = 0;
        for (Map.Entry<String, Double> entry : divisis.entrySet()) {
            if (divisi.equals(entry.getKey())) {
                tunjangan = entry.getValue();
            }
        }
        return tunjangan;
    }

    public static double calculateTunjanganKesehatan(double gajiPokok) {
        double tunjanganKesahatan = 0.02;

        return gajiPokok * tunjanganKesahatan;
    }

    public static double calculatePotonganBPJS(double gajiPokok) {
        double potonganBPJS = 0.03;
        return gajiPokok * potonganBPJS;
    }

    public static double calculatePotonganPPH(double gajiPokok) {
        double potonganPPH = 0.05;

        return gajiPokok * potonganPPH;
    }

    public static double getTunjanganMakan() {
        int hariKerja = 22;
        double tunjanganMakan = 50_000;
        return hariKerja * tunjanganMakan;
    }

    public static double calculateGajiBersih(String posisi, String divisi) {
        double gajiPokok = getGajiPokok(divisi, posisi);
        double tunjanganTransport = getTunjanganTransport(divisi);
        double tunjanganKesehatan = calculateTunjanganKesehatan(gajiPokok);
        double tunjanganMakan = getTunjanganMakan();
        double BPJS = calculatePotonganBPJS(gajiPokok);
        double PPH = calculatePotonganPPH(gajiPokok);

        double gajiBersih = gajiPokok + tunjanganTransport + tunjanganKesehatan + tunjanganMakan - BPJS - PPH;
        return gajiBersih;
    }
}
