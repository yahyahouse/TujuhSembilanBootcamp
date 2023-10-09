package org.example.ArutalaCodingQuiz.quiz1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AgenTravel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int jumlahPenumpang = scanner.nextInt();
        if (jumlahPenumpang<=120 && jumlahPenumpang>0){
            System.out.print(rekomendasiBus(jumlahPenumpang));
        }
        scanner.close();
    }

    public static int rekomendasiBus(int jumlahPenumpang) {
        List<Bus> listBus = new ArrayList<>();
        listBus.add(new Bus(60, 2300000));
        listBus.add(new Bus(45, 2000000));
        listBus.add(new Bus(32, 1800000));
        listBus.add(new Bus(18, 1500000));
        listBus.add(new Bus(12, 1300000));

        double hargaTermurah = Double.MAX_VALUE;
        Bus busTermurah = null;
        int jumlahBus = 0;
        int hargaTermahal = 2300000;

        if (jumlahPenumpang > 60) {
            jumlahPenumpang = jumlahPenumpang - 60;
            jumlahBus++;
        }

        for (Bus bus : listBus) {
            if (jumlahPenumpang <= bus.getJumlahKursi() && bus.getHargaBus() < hargaTermurah) {
                busTermurah = bus;
                hargaTermurah = bus.getHargaBus();
            }
        }
        int totalHarga = busTermurah.getHargaBus() + jumlahBus * hargaTermahal;
        return totalHarga;
    }
}

class Bus {
    private int jumlahKursi;
    private int hargaBus;

    public int getJumlahKursi() {
        return jumlahKursi;
    }

    public int getHargaBus() {
        return hargaBus;
    }

    public Bus(int jumlahKursi, int hargaBus) {
        this.jumlahKursi = jumlahKursi;
        this.hargaBus = hargaBus;
    }
}
