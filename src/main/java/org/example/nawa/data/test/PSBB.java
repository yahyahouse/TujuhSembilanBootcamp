package org.example.nawa.data.test;

import java.util.Scanner;

public class PSBB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Jumlah keluarga : ");
        int jumlahKeluarga = scanner.nextInt();

        System.out.println("Jumlah anggota keluarga : ");
        int[] jumlahAnggotaKeluarga = new int[jumlahKeluarga];

        for (int i = 0; i < jumlahKeluarga; i++) {
            jumlahAnggotaKeluarga[i] = scanner.nextInt();
            if (jumlahAnggotaKeluarga[i] > 4) {
                System.out.println("Input must be equal with count of family");
                return;
            }
        }


        for (int i = 0; i < jumlahKeluarga - 1; i++) {
            for (int j = 0; j < jumlahKeluarga - i - 1; j++) {
                if (jumlahAnggotaKeluarga[j] > jumlahAnggotaKeluarga[j + 1]) {
                    int temp = jumlahAnggotaKeluarga[j];
                    jumlahAnggotaKeluarga[j] = jumlahAnggotaKeluarga[j + 1];
                    jumlahAnggotaKeluarga[j + 1] = temp;
                }
            }
        }


        int totalBus = 0;
        boolean[] sudahDimasukkan = new boolean[jumlahKeluarga];
        for (int i = 0; i < jumlahKeluarga-1 ; i++) {
            if (!sudahDimasukkan[i]) {
                if (jumlahAnggotaKeluarga[i] + jumlahAnggotaKeluarga[i + 1] <= 4) {
                    totalBus++;
                    sudahDimasukkan[i] = true;
                    sudahDimasukkan[i + 1] = true;
                } else if (jumlahAnggotaKeluarga[i] <= 4) {
                    totalBus++;
                    sudahDimasukkan[i] = true;
                }
            }

        }
        if (!sudahDimasukkan[jumlahKeluarga-1] && jumlahAnggotaKeluarga[jumlahKeluarga-1] <= 4) {
            totalBus++;
        }
        System.out.println("Total bus : " + totalBus);


    }
}
