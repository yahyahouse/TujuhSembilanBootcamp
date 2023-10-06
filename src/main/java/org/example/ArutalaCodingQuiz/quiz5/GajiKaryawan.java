package org.example.ArutalaCodingQuiz.quiz5;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GajiKaryawan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String posisi = scanner.nextLine();
        String divisi = scanner.next();

        int jumlahHariKerjaPerBulan =22;

        int gajiBersih = calculateGajiBersih(posisi,divisi,jumlahHariKerjaPerBulan);

        System.out.println(posisi);
        System.out.println(divisi);
        System.out.println(jumlahHariKerjaPerBulan+" hari");
        System.out.print(formatCurrency(gajiBersih));


    }

    public static String formatCurrency(int angka) {
        DecimalFormat konvert = new DecimalFormat("###,###,###,###.00");
        return konvert.format(angka);

    }

    public static int getGajiPokok(String posisi, String divisi) {
        int[][] daftarGajiPokok =
                {
                        {8000000, 9000000, 7500000, 7200000, 8500000},
                        {7000000, 8000000, 6500000, 6200000, 7500000},
                        {7500000, 8500000, 7000000, 6800000, 8000000},
                        {10000000, 11000000, 9500000, 9200000, 10500000},
                        {7500000, 8500000, 7000000, 6800000, 8000000}};
        Map<String, Integer> namaPosisi = new HashMap<>();
        namaPosisi.put("Software Engineer", 0);
        namaPosisi.put("Data Analyst", 1);
        namaPosisi.put("UX Designer", 2);
        namaPosisi.put("Project Manager", 3);
        namaPosisi.put("QA Engineer", 4);

        int noPosisi = namaPosisi.get(posisi);

        Map<String, Integer> namaDivisi = new HashMap<>();
        namaDivisi.put("Surabaya", 0);
        namaDivisi.put("Jakarta", 1);
        namaDivisi.put("Bandung", 2);
        namaDivisi.put("Medan", 3);
        namaDivisi.put("Makassar", 4);

        int noDivisi = namaDivisi.get(divisi);

        return daftarGajiPokok[noPosisi][noDivisi];
    }

    public static int getTunjanganTransport(String divisi) {
        Map<String, Integer> tunjanganTransportasi = new HashMap<>();
        tunjanganTransportasi.put("Surabaya", 1000000);
        tunjanganTransportasi.put("Jakarta", 1500000);
        tunjanganTransportasi.put("Bandung", 1200000);
        tunjanganTransportasi.put("Medan", 1100000);
        tunjanganTransportasi.put("Makassar", 1300000);

        return tunjanganTransportasi.get(divisi);
    }

    public static int calculateTunjanganKesehatan(int gajiPokok) {
        int tunjanganKesehatan = (int) (gajiPokok * 0.02);
        return tunjanganKesehatan;
    }

    public static int calculatePotonganBPJS(int gajiPokok) {
        int potonganBPJS = (int) (gajiPokok * 0.03);
        return potonganBPJS;
    }

    public static int calculatePotonganPPH(int gajiPokok) {
        int potonganPPH = (int) (gajiPokok * 0.05);
        return potonganPPH;
    }

    public static int calculateTunjanganMakan(int jumlahHariKerjaPerBulan) {
        int tunjanganMakanPerHari = 50000;
        int tunjanganMakan = jumlahHariKerjaPerBulan * tunjanganMakanPerHari;
        return tunjanganMakan;
    }

    public static int calculateGajiBersih(String posisi, String divisi, int jumlahHariKerjaPerBulan) {
        int gajiPokok = getGajiPokok(posisi, divisi);
        return gajiPokok + calculateTunjanganMakan(jumlahHariKerjaPerBulan) + getTunjanganTransport(divisi)
                + calculateTunjanganKesehatan(gajiPokok) - calculatePotonganBPJS(gajiPokok)
                - calculatePotonganPPH(gajiPokok);
    }
}
