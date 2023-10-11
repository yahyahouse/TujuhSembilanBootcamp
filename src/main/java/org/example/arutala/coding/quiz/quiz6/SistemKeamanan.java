package org.example.arutala.coding.quiz.quiz6;

import java.util.Scanner;

public class SistemKeamanan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String kalimat = scanner.nextLine();
        String kalimatTanpaSpasi = hapusSpasi(kalimat);
        Boolean isPolindrom = isPalindrom(kalimat);
        int jumlahHuruf = hitungJumlahHuruf(kalimat);

        System.out.println(kalimatTanpaSpasi);
        System.out.println(isPolindrom);
        System.out.println(jumlahHuruf);
        if (isPolindrom){
            System.out.print("Silahkan Masuk");
        }else {
            System.out.print("Akses Ditolak");
        }
    }

    public static String hapusSpasi(String kalimat){
        return kalimat.replaceAll("\\s", "");
    }
    public static Boolean isPalindrom(String kalimat){
        int panjang = kalimat.length();
        for (int i = 0; i < panjang / 2; i++) {
            if (kalimat.charAt(i) != kalimat.charAt(panjang - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static int hitungJumlahHuruf(String kalimat){

        return hapusSpasi(kalimat).length();
    }
}
