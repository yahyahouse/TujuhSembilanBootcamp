package org.example;

import java.lang.reflect.Array;
import java.util.Scanner;

public class MencariArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("masukan angka");
        Integer input = scan.nextInt();
        Integer total = 0;
        Integer[] angka = {3,2,5,11,7,10,11,3,15,11,17,10,5};


        for (Integer integer : angka) {
            if (integer == input) {
                total++;
            }
        }
        if (total>=1){
            System.out.println("Angka yang anda cari ditemukan");
            System.out.println("ditemukan "+total+" angka "+input+" didalam array");
            System.out.println("yaitu pada index ke");
            for (int i = 0;i<angka.length;i++){
                if (angka[i]==input){
                    System.out.print(i+" ");
                }
            }
        }else {
            System.out.println("angka tidak ditemukan");
        }

    }
}
