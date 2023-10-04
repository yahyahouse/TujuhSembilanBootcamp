package org.example.liveCode;

import java.util.Arrays;
import java.util.Scanner;

public class MengurutkanDataInteger2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int angka1 = scanner.nextInt();
        int angka2 = scanner.nextInt();
        int angka3 = scanner.nextInt();
        int[] angka = {angka1,angka2,angka3};

        if (angka1 >= -300 && angka1 <= 300 && angka2 >= -300 && angka2 <= 300 && angka3 >= -300 && angka3 <= 300) {
            for (int i = 0; i<angka.length; i++){
                for (int j = i+1; j<angka.length;j++){
                    if (angka[i]>angka[j]){
                        int tampung = angka[i];
                        angka[i] = angka[j];
                        angka[j] = tampung;
                    }
                }
            }
            System.out.print(Arrays.toString(angka));
        }

    }
}
