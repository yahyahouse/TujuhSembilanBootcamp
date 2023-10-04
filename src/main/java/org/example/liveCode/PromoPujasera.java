package org.example.liveCode;

import java.util.Scanner;

public class PromoPujasera {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double harga = scanner.nextDouble();
        int tanggal = scanner.nextInt();
        if (harga>=50000){
             double potongan=0.02*tanggal*harga;
             harga = harga - potongan;
        }
        System.out.printf("%.2f", harga);
        scanner.close();
    }
}
