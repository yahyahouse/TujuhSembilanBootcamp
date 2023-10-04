package org.example.liveCode;

import java.util.Scanner;

public class MaksimalTigaBilangan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int angka1 = scanner.nextInt();
        int angka2 = scanner.nextInt();
        int angka3 = scanner.nextInt();

        int terbesar;
        if (angka1>angka2 && angka1>angka3){
            terbesar = angka1;
        } else if (angka2>angka3) {
            terbesar=angka2;
        }else {
            terbesar = angka3;
        }
        System.out.print(terbesar);
        scanner.close();
    }
}
