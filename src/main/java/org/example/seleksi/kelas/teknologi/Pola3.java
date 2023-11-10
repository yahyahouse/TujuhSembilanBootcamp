package org.example.seleksi.kelas.teknologi;

import java.util.Scanner;

public class Pola3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int angka = scanner.nextInt();
        int num = 1;
        for (int i =1;i<=angka;i++){
            for (int j = 1; j <= angka-i+1; j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
}
