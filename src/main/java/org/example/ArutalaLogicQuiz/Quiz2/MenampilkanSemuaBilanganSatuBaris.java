package org.example.ArutalaLogicQuiz.Quiz2;

import java.util.Scanner;

public class MenampilkanSemuaBilanganSatuBaris {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bilanganAwal = scanner.nextInt();
        int bilanganAkhir = scanner.nextInt();
        menampilkanSemuaBilangan(bilanganAwal,bilanganAkhir);
        scanner.close();
    }

    public static void menampilkanSemuaBilangan(int bilangaAwal, int bilanganAkhir) {
        for (int i = bilangaAwal; i <= bilanganAkhir; i++) {
            if (i == bilanganAkhir) {
                System.out.print(i);
            } else {
                System.out.println(i);
            }
        }
    }
}
