package org.example.arutala.endurance.challenge2;

import java.util.Scanner;

public class BilanganXHinggaY {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bilanganPertama = scanner.nextInt();
        int bilanganTerakir = scanner.nextInt();

        for (int i=bilanganPertama;i<=bilanganTerakir;i++){
            System.out.println(i);
        }
    }
}
