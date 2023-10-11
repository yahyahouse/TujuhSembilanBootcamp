package org.example.arutala.endurance.challenge;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class KonversiDetikKeHariJamMenitDetik {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int jumlahDetik = scanner.nextInt();

        Map<String, Integer> data = konversiDetik(jumlahDetik);

        data.forEach((key, value) -> System.out.println(value));
    }

    public static Map<String, Integer> konversiDetik(int jumlahDetik) {
        int detikKeHari = 60 * 60 * 24;
        int detikKeJam = 60 * 60;
        int detikKeMenit = 60;

        int hari = 0;
        int jam = 0;
        int menit = 0;
        while (jumlahDetik >= detikKeHari) {
            hari++;
            jumlahDetik -= detikKeHari;
        }
        while (jumlahDetik >= detikKeJam) {
            jam++;
            jumlahDetik -= detikKeJam;
        }
        while (jumlahDetik >= detikKeMenit) {
            menit++;
            jumlahDetik -= detikKeMenit;
        }

        Map<String, Integer> konversiWaktu = new LinkedHashMap<>();
        konversiWaktu.put("hari", hari);
        konversiWaktu.put("jam", jam);
        konversiWaktu.put("menit", menit);
        konversiWaktu.put("detik", jumlahDetik);
        return konversiWaktu;
    }
}
