package org.example.arutala.coding.quiz.quiz1;

import java.util.Scanner;

public class KeluargaMenabung {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int jumlahKeluarga = scanner.nextInt();
        int lamaMenabung = scanner.nextInt();

        System.out.print(menghitungLamaMenabung(jumlahKeluarga, lamaMenabung));
        scanner.close();
    }

    public static int menghitungLamaMenabung(int jumlahKeluarga, int lamaMenabung) {
        String[] bulan31Hari = {"Januari", "Maret", "Mei", "Juli", "Agustus", "Oktober", "Desember"};
        String[] bulan30Hari = {"April", "Juni", "September", "November"};
        String[] namaBulan = {
                "Januari", "Februari", "Maret", "April", "Mei", "Juni",
                "Juli", "Agustus", "September", "Oktober", "November", "Desember"
        };
        int tahunSekarang = 2024;
        int jumlahHari;
        int totalMenabung = 0;


        for (int i = 1; i <= lamaMenabung; i++) {
            if (namaBulan[i - 1].equals("Februari")) {
                if ((tahunSekarang % 4 == 0 && tahunSekarang % 100 != 0) || tahunSekarang % 400 == 0) {
                    jumlahHari = 29;
                    totalMenabung += menghitungHasilTabungan(jumlahKeluarga, jumlahHari);
                } else {
                    jumlahHari = 28;
                    totalMenabung += menghitungHasilTabungan(jumlahKeluarga, jumlahHari);
                }
            }
            for (int k = 0; k < bulan30Hari.length; k++) {
                if (namaBulan[i - 1].equals(bulan30Hari[k])) {
                    jumlahHari = 30;
                    totalMenabung += menghitungHasilTabungan(jumlahKeluarga, jumlahHari);
                }
            }
            for (int k = 0; k < bulan31Hari.length; k++) {
                if (namaBulan[i - 1].equals(bulan31Hari[k])) {
                    jumlahHari = 31;
                    totalMenabung += menghitungHasilTabungan(jumlahKeluarga, jumlahHari);
                }
            }
        }

        return totalMenabung;
    }

    public static int menghitungHasilTabungan(int jumlahKeluarga, int jumlahHari) {
        int totalTabungan = 0;
        for (int i = 1; i <= jumlahHari; i++) {
            totalTabungan += i * 1000 * jumlahKeluarga;
        }
        return totalTabungan;
    }
}
