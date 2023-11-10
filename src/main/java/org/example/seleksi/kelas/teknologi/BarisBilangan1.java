package org.example.seleksi.kelas.teknologi;

import java.util.Scanner;

public class BarisBilangan1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int angkaPertama = scanner.nextInt();

        int[] barisBilangan = new int[15];
        int selisih = 3;
        int nilai = angkaPertama;

        for (int i = 0;i<barisBilangan.length;i++){
            if (selisih==3){
                barisBilangan[i] = nilai;
                nilai += 3;
                selisih=4;
            } else if (selisih==4) {
                barisBilangan[i] = nilai;
                nilai += 4;
                selisih=5;
            }else if (selisih==5) {
                barisBilangan[i] = nilai;
                nilai += 5;
                selisih=3;
            }
        }
        for (int j : barisBilangan) {
            System.out.print(j + " ");

        }
    }
}
