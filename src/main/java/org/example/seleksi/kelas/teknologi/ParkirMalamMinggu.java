package org.example.seleksi.kelas.teknologi;

import java.util.Scanner;

public class ParkirMalamMinggu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int jenisKendaraan = scanner.nextInt();
        int lamaParkir = scanner.nextInt();

        int tarifAwalMobil = 1500;
        int tarifAwalMotor = 1000;
        int totalBiaya = 0;
        if(lamaParkir>8){
            System.out.println("disegel");
            return;
        }
        if (jenisKendaraan==1){
            totalBiaya=tarifAwalMobil*lamaParkir;
        } else if (jenisKendaraan==2) {
            totalBiaya=tarifAwalMotor*lamaParkir;
        }
        if (lamaParkir>5){
            totalBiaya=totalBiaya+500*(lamaParkir-5);
        }
        System.out.println(totalBiaya);
    }
}
