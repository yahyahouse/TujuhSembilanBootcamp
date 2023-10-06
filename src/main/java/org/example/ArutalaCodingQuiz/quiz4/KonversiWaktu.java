package org.example.ArutalaCodingQuiz.quiz4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class KonversiWaktu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int waktuDalamDetik = scanner.nextInt();
        Map<String, Integer> hasil = mengubahDetikKeHariJamMenit(waktuDalamDetik);
        System.out.println(hasil.get("hari"));
        System.out.println(hasil.get("jam"));
        System.out.println(hasil.get("menit"));
        System.out.print(hasil.get("detik"));
        scanner.close();
    }

    public static Map<String, Integer> mengubahDetikKeHariJamMenit(int waktuDalamDetik) {
        int hariKeDetik = 86400;
        int jamKeDetik = 3600;
        int menitKeDetik = 60;

        int hasilHari = 0;
        int sisaDetik = waktuDalamDetik;
        while (sisaDetik >= hariKeDetik) {
            hasilHari += 1;
            sisaDetik -= hariKeDetik;
        }

        int hasilJam = 0;
        while (sisaDetik >= jamKeDetik) {
            hasilJam += 1;
            sisaDetik -= jamKeDetik;
        }
        int hasilMenit = 0;
        while (sisaDetik >= menitKeDetik) {
            hasilMenit += 1;
            sisaDetik -= menitKeDetik;
        }

        Map<String, Integer> hasil = new HashMap<>();
        hasil.put("hari", hasilHari);
        hasil.put("jam", hasilJam);
        hasil.put("menit", hasilMenit);
        hasil.put("detik", sisaDetik);
        return hasil;
    }
}
