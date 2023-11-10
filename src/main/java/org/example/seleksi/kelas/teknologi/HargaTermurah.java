package org.example.seleksi.kelas.teknologi;

import java.util.Scanner;

public class HargaTermurah {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int harga1 = scanner.nextInt();
        int harga2 = scanner.nextInt();
        if(harga1>harga2){
            System.out.println(harga2);
        }else{
            System.out.println(harga1);
        }
    }
}
