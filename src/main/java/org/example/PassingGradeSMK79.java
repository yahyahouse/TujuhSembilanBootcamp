package org.example;

import java.util.Scanner;

public class PassingGradeSMK79 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nilai ujian Matematika ");
        Integer matematika = scan.nextInt();
        System.out.println("Nilai ujian Bhs. Indonesia");
        Integer indonesia = scan.nextInt();
        System.out.println("Nilai ujian Bhs. Inggris");
        Integer inggris = scan.nextInt();
        System.out.println("Nilai ujian IPA");
        Integer ipa = scan.nextInt();

        Integer rata = (matematika + inggris + indonesia + ipa) / 4;
        Integer rataSastra = (inggris + indonesia) / 2;
        Integer rataTKJ = (matematika + ipa) / 2;
        boolean Hasil = rata >= 73;
        boolean sastra = rataSastra >= 75;
        boolean TKJ = rataTKJ >= 80;
        System.out.println("Hasil dari simulasi ");
        System.out.println("=======================");
        System.out.println("Apakah memnuhi syarat untuk masuk ke SMK 79 ? " + Hasil);
        System.out.println("Apakah memnuhi syarat untuk masuk ke Jurusan Sastra ? " + sastra);
        System.out.println("Apakah memnuhi syarat untuk masuk ke Jurusan Teknik Komputer Jaringan ? " + TKJ);
        scan.close();
    }
}
