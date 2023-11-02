package org.example.arutala.endurance.challenge2;

import java.util.Scanner;

public class MendapatDiscount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double hargaBarang = scanner.nextDouble();
        int jumlahBarang = scanner.nextInt();
        double totalHarga = jumlahBarang*hargaBarang;
        double hargaDiskon = 0.15;
        if (jumlahBarang % 3 == 0 && jumlahBarang%4==0){
            totalHarga= totalHarga-totalHarga*hargaDiskon;
        }
        System.out.printf("%.2f",totalHarga);
    }
}
