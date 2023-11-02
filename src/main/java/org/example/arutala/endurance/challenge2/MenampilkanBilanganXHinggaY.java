package org.example.arutala.endurance.challenge2;

import java.util.Scanner;

public class MenampilkanBilanganXHinggaY {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bilanganPertama = scanner.nextInt();
        int bilanganterakhir = scanner.nextInt();

        for (int i = bilanganPertama;i<=bilanganterakhir;i++){
            System.out.print(i+" ");
        }
    }
}
