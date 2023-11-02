package org.example.arutala.endurance.challenge2;

import java.util.Scanner;

public class KeluargaMenabung {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int jumlahKeluarga = scanner.nextInt();
        int lamaMenabung = scanner.nextInt();
        int totalMenabung = 0;
        int jumlahHari;

        String[] bulan31Hari = {"Januari", "Maret", "Mei", "Juli", "Agustus", "Oktober", "Desember"};
        String[] bulan30Hari = {"April", "Juni", "September", "November"};
        String[] namaBulan = {
                "Januari", "Februari", "Maret", "April", "Mei", "Juni",
                "Juli", "Agustus", "September", "Oktober", "November", "Desember"
        };

        for (int i = 1; i <= lamaMenabung; i++) {
            if (namaBulan[i - 1].equals("Februari")) {
                jumlahHari = 29;
                totalMenabung += menghitungHasilTabungan(jumlahKeluarga, jumlahHari);
            }
            for (int j = 0; j < bulan30Hari.length; j++) {
                if (namaBulan[i - 1].equals(bulan30Hari[j])) {
                    jumlahHari = 30;
                    totalMenabung += menghitungHasilTabungan(jumlahKeluarga, jumlahHari);
                }
            }
            for (int j = 0; j < bulan31Hari.length; j++) {
                if (namaBulan[i - 1].equals(bulan31Hari[j])) {
                    jumlahHari = 31;
                    totalMenabung += menghitungHasilTabungan(jumlahKeluarga, jumlahHari);
                }
            }
        }
        System.out.print(totalMenabung);
    }

    public static int menghitungHasilTabungan(int jumlahKeluarga, int jumlahHari) {
        int totalTabungan = 0;
        for (int i = 1; i <= jumlahHari; i++) {
            totalTabungan += i * 1000 * jumlahKeluarga;
        }
        return totalTabungan;
    }
}
