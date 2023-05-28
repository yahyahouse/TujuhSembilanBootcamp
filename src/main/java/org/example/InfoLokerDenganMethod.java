package org.example;

import java.util.Scanner;

public class InfoLokerDenganMethod {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("nama : ");
        String nama = scan.next();
        System.out.println("umur : ");
        Integer umur = scan.nextInt();
        System.out.println("jenis kelamin (pria/wanita): ");
        String jk = scan.next();
        System.out.println("lulusan : ");
        String lulusan = scan.next();
        System.out.println("pengalaman : ");
        Integer pengalaman = scan.nextInt();
        System.out.println("penampilan (1/10) : ");
        Integer penampilan = scan.nextInt();
        System.out.println("posisi yang di lamar (SPV, Admin, Koordinator :");
        String posisi = scan.next();

        System.out.println("=======================");
        System.out.println(nama + "terima kasih sudah mengikuti lowongan kerja PT abal abal");
        System.out.println("berikut hasil nya");
        System.out.println(info(nama,posisi,jk,umur,lulusan,pengalaman,penampilan));
    }

    public static String info(String nama, String posisi, String jk, Integer umur, String lulusan, Integer pengalaman, Integer penampilan){
        String hasil = "";
        if (posisi.equalsIgnoreCase("koordinator")) {
            if (jk.equalsIgnoreCase("pria") && umur >= 21 && umur <= 30 && (lulusan.equalsIgnoreCase("SMK") ||
                    lulusan.equalsIgnoreCase("D3")) && pengalaman >= 2) {
                hasil = "Selamat, " + nama + ".\nAnda memenuhi syarat sebagai " + posisi + ". Dan akan masuk ke Tahap Selanjutnya.";
            } else if (jk.equalsIgnoreCase("pria") && umur > 30 && lulusan.equalsIgnoreCase("S1") && pengalaman >= 5) {
                hasil = "Selamat, " + nama + ".\nAnda memenuhi syarat sebagai " + posisi + ". Dan akan masuk ke Tahap Selanjutnya.";
            } else {
                hasil = "Maaf," + nama + ".\nAnda Tidak memenuhi syarat sebagai " + posisi + ". Dan Tidak akan masuk ke Tahap Selanjutnya.";
            }
        } else if (posisi.equalsIgnoreCase("admin")) {
            if (jk.equalsIgnoreCase("wanita") && umur >= 20 && umur <= 25 && lulusan.equalsIgnoreCase("D3") &&
                    (penampilan >= 8.5 || pengalaman >= 1)) {
                hasil = "Selamat, " + nama + ".\nAnda memenuhi syarat sebagai " + posisi + ". Dan akan masuk ke Tahap Selanjutnya.";
            } else if (jk.equalsIgnoreCase("wanita") && umur > 25 && lulusan.equalsIgnoreCase("S1") &&
                    penampilan >= 8.5 && pengalaman >= 3) {
                hasil = "Selamat, " + nama + ".\nAnda memenuhi syarat sebagai " + posisi + ". Dan akan masuk ke Tahap Selanjutnya.";
            } else if (jk.equalsIgnoreCase("pria") && umur >= 20 && umur <= 30 && penampilan > 8.5 && (lulusan.equalsIgnoreCase("D3") ||
                    lulusan.equalsIgnoreCase("S1")) && pengalaman >= 2) {
                hasil = "Selamat, " + nama + ".\nAnda memenuhi syarat sebagai " + posisi + ". Dan akan masuk ke Tahap Selanjutnya.";
            } else {
                hasil = "Maaf," + nama + ".\nAnda Tidak memenuhi syarat sebagai " + posisi + ". Dan Tidak akan masuk ke Tahap Selanjutnya.";
            }

        } else if (posisi.equalsIgnoreCase("psv")) {
            if (umur >= 23 && umur <= 30 && lulusan.equalsIgnoreCase("S1") && pengalaman > 1) {
                hasil = "Selamat, " + nama + ".\nAnda memenuhi syarat sebagai" + posisi + ". Dan akan masuk ke Tahap Selanjutnya.";
            } else if (umur >= 25 && umur <= 35 && lulusan.equalsIgnoreCase("D3") && pengalaman > 4) {
                hasil = "Selamat, " + nama + ".\nAnda memenuhi syarat sebagai" + posisi + ". Dan akan masuk ke Tahap Selanjutnya.";
            } else {
                hasil = "Maaf," + nama + ".\nAnda Tidak memenuhi syarat sebagai " + posisi + ". Dan Tidak akan masuk ke Tahap Selanjutnya.";
            }
        } else {
            hasil = "maaf posisi yang anda masukan tidak tersedia ";
        }
        return hasil;
    }
}
