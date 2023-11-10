package org.example.seleksi.kelas.teknologi;

import java.util.Scanner;

public class KelipatanTigaDanEmpat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int angka = scanner.nextInt();
        int cek=0;
        if(angka%3==0&&angka%4==0){
            cek=1;
        }
        System.out.print(cek);
    }
}
