package org.example;

import java.util.Scanner;

public class CafeReservation {
    public static void main(String[] args) {
        String result = "";
        Scanner scan = new Scanner(System.in);

        System.out.println("Selamat datang di cafe");

        System.out.println("Siapa nama kamu :");
        String nama = scan.next();
        System.out.println("Umur kamu :");
        Integer umur = scan.nextInt();
        System.out.println("Jenis kelamin kamu :");
        String jk = scan.next();
        System.out.println("Seberapa menarik kamu (dari 1 sampai 10) :");
        Integer menarik = scan.nextInt();
        System.out.println("berapa banyak uang mu sakarang :");
        Integer uang = scan.nextInt();
        System.out.println("Hari apa kamu akan berkunjung :");
        String hari = scan.next();

        if (hari.equalsIgnoreCase("senin")) {
            if (umur >= 20 && umur <= 30 && uang >= 500) {
                result = "Pemesanan berhasil, kamu memesan di hari " + hari + ". Young Night";
            } else {
                result = "Maaf, kamu tidak bisa memesan pada hari " + hari + " karena ini untuk Young Night";
            }
        } else if (hari.equalsIgnoreCase("selasa")) {
            if (umur > 30 && umur <= 50 && uang >= 250) {
                result = "Pemesanan berhasil, kamu memesan di hari " + hari + ". Oldest Night";
            } else {
                result = "Maaf, kamu tidak bisa memesan pada hari " + hari + " karena ini untuk Oldest Night";
            }
        } else if (hari.equalsIgnoreCase("rabu")) {
            if (umur >= 20 && umur <= 35 && jk.equalsIgnoreCase("wanita") && menarik >= 8 && uang >= 300) {
                result = "Pemesanan berhasil, kamu memesan di hari " + hari + ". Ladies Night";
            } else {
                result = "Maaf, kamu tidak bisa memesan pada hari " + hari + " karena ini untuk Ladies Night";
            }
        } else if (hari.equalsIgnoreCase("kamis")) {
            if (umur > 20 && umur <= 30 && ((jk.equalsIgnoreCase("wanita") && menarik >= 8) || jk.equalsIgnoreCase("pria") && uang >= 1000)) {
                result = "Pemesanan berhasil, kamu memesan di hari " + hari + ". Party Night For Single";
            } else {
                result = "Maaf, kamu tidak bisa memesan pada hari " + hari + " karena ini untuk Party Night For Single";
            }
        } else if (hari.equalsIgnoreCase("jumat")) {
            if (jk.equalsIgnoreCase("pria") && umur > 20 && umur <= 25 && menarik >= 8) {
                result = "Pemesanan berhasil, kamu memesan di hari " + hari + ". Women Night";
            } else if (jk.equalsIgnoreCase("wanita") && umur > 30 && umur <= 45 && uang >= 1000) {
                result = "Pemesanan berhasil, kamu memesan di hari " + hari + ". Women Night";
            } else {
                result = "Maaf, kamu tidak bisa memesan pada hari " + hari + " karena ini untuk Women Night";
            }
        } else if (hari.equalsIgnoreCase("sabtu") || hari.equalsIgnoreCase("minggu")) {
            if (umur >= 18 && umur <= 60 && uang >= 100) {
                result = "Pemesanan berhasil, kamu memesan di hari " + hari + ". Weekend Freedom";
            } else {
                result = "Maaf, kamu tidak bisa memesan pada hari " + hari + " karena ini untuk Weekend Freedom";
            }
        } else {
            result = "Maaf, Kamu tidak bisa memesan di hari apa pun ";
        }

        System.out.println("===========");
        System.out.println("Hi " + nama + " Terima kasih telah menggunakan aplikasi ini ");
        System.out.println("ini adalah hasil dari pemesanan :");
        System.out.println(result);
    }
}
