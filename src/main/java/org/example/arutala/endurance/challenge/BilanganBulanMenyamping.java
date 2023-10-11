package org.example.arutala.endurance.challenge;

import java.util.Scanner;

public class BilanganBulanMenyamping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int angkaPertama = scanner.nextInt();
        int angkaKedua = scanner.nextInt();

        menampilkanBilanganBulatMenyamping(angkaPertama,angkaKedua);
        scanner.close();
    }

    public static void menampilkanBilanganBulatMenyamping(int angkaPertama, int angkaKedua) {

        for (int i = angkaPertama; i <= angkaKedua; i++) {
            if (i==angkaKedua){
                System.out.print(i);
            }else {
                System.out.print(i+" ");
            }
        }

    }
}
