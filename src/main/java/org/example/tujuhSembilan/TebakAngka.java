package org.example.tujuhSembilan;

import java.util.Random;
import java.util.Scanner;

public class TebakAngka {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        boolean kalah = true;
        int angkaRandom = random.nextInt(10);
        System.out.println("masukan angka");

        for (int i =1; i<=3;i++){
            int angka = scan.nextInt();
            if (angka==angkaRandom){
                System.out.println("RIGHT");
                System.out.println("kamu memenangkan game ini");
                kalah = false;
                break;
            }else if (Math.abs(angka-angkaRandom) == 1){
                System.out.println("hot");
            }else if (Math.abs(angka-angkaRandom) == 2){
                System.out.println("warm");
            }else {
                System.out.println("cold");
            }
        }
        if (kalah==true) {
            System.out.println("salah");
            System.out.println("jawaban yang benar adalah " + angkaRandom);
            System.out.println("kamu kalah dalam permaian");
        }
    }
}
