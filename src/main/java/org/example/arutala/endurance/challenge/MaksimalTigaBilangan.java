package org.example.arutala.endurance.challenge;

import java.util.Scanner;

public class MaksimalTigaBilangan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] bilangan = new int[3];
        for (int i=0;i<bilangan.length;i++){
            bilangan[i] = scanner.nextInt();
        }

        System.out.print(menghitungBilanganTerbesar(bilangan));
        scanner.close();
    }
    public static int menghitungBilanganTerbesar(int[] bilangan){
        int nilaiMaks = bilangan[0];
        for (int i=0; i<bilangan.length;i++){
            if(bilangan[i]>nilaiMaks){
                nilaiMaks=bilangan[i];
            }
        }
        return nilaiMaks;
    }
}
