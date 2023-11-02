package org.example.arutala.endurance.challenge2;

import java.util.Scanner;

public class Maksimal10Bilangan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] kumpulanBilangan = new int[10];

        for (int i =0;i<kumpulanBilangan.length;i++){
            kumpulanBilangan[i]= scanner.nextInt();
        }

        int angkatebesar=0;
        for (int i=0;i<kumpulanBilangan.length;i++){
            if (kumpulanBilangan[i]>angkatebesar){
                angkatebesar=kumpulanBilangan[i];
            }
        }
        System.out.print(angkatebesar);
    }
}
