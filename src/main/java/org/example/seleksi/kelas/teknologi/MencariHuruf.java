package org.example.seleksi.kelas.teknologi;

import java.util.Scanner;

public class MencariHuruf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String huruf = scanner.next();
        char[] hurufArray = {'j','t','k','p','o','l','b','a','n'};

        int cek=0;
        for (char c:hurufArray){
            if (c==huruf.toLowerCase().charAt(0)){
                cek=1;
            }
        }
        if (cek==0){
            System.out.println("tidak ada");
        }else {
            System.out.println("ada");
        }
    }
}
