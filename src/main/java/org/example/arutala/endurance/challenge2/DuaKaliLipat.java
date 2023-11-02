package org.example.arutala.endurance.challenge2;

import java.util.Scanner;

public class DuaKaliLipat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int angka = scanner.nextInt();
        if (angka>100||angka<0){
            System.out.print("hanya angka 0 sampai 100");
            return;
        }
        System.out.print(angka*2);
    }
}
