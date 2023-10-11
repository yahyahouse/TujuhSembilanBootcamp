package org.example.arutala.endurance.challenge;

import java.util.Scanner;

public class BarisBilangan1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sukuPertama = scanner.nextInt();

        int[] barisanBilangan = barisanBilangan(sukuPertama);
        for (int bilangan : barisanBilangan) {
            System.out.print(bilangan + " ");
        }
    }

    public static int[] barisanBilangan(int sukuPertama) {
        int[] barisanBilangan = new int[15];
        int deret = sukuPertama;
        int selish = 3;
        barisanBilangan[0] = sukuPertama;
        for (int i = 1; i < barisanBilangan.length; i++) {
            if (selish == 3) {
                barisanBilangan[i] = deret + 3;
                deret += 3;
                selish = 4;
            } else if (selish == 4) {
                barisanBilangan[i] = deret + 4;
                deret += 4;
                selish = 5;
            } else if (selish == 5) {
                barisanBilangan[i] = deret + 5;
                deret += 5;
                selish = 3;
            }
        }
        return barisanBilangan;
    }
}
