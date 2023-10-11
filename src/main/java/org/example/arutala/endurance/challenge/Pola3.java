package org.example.arutala.endurance.challenge;

import java.util.Scanner;

public class Pola3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ukuranPola = scanner.nextInt();
        membentukPola(ukuranPola);
    }
    public static void membentukPola(int ukuranPola){
        int angka =0;
        for (int i=0;i<ukuranPola;i++){
            for (int j=ukuranPola;i<j;j--){
                angka++;
                System.out.print(angka+" ");
            }
            System.out.println();
        }
    }
}
