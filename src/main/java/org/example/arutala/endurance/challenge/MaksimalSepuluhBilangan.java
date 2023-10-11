package org.example.arutala.endurance.challenge;

import java.util.Scanner;

public class MaksimalSepuluhBilangan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arrBilangan = new int[10];
        for (int i =0; i<arrBilangan.length;i++){
            arrBilangan[i]=scanner.nextInt();
        }
        System.out.print(menghitungBilanganTerbesar(arrBilangan));
        scanner.close();

    }
    public static int menghitungBilanganTerbesar(int[] arrBilangan){
        int nilaiMaks = arrBilangan[0];
        for (int i=0; i<arrBilangan.length;i++){
            if(arrBilangan[i]>nilaiMaks){
                nilaiMaks=arrBilangan[i];
            }
        }
        return nilaiMaks;
    }
}
