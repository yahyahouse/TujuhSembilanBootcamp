package org.example.ArutalaCodingQuiz.Quiz1;

import java.util.Scanner;

public class MenghitungLubang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String kata = scanner.nextLine();
        char[] huruf = kata.toCharArray();
        System.out.print(menghitungLubangKata(huruf));
        scanner.close();
    }
    public static int menghitungLubangKata(char[] kalimat){
        int jumlah = 0;
        char[] daftarHurufBerlubangSatu = {'A','a','b','D','d','e','g','O','o','P','p','Q','q','R','4','6','9','0'};
        char[] daftarHurufBelubangDua = {'B','8'};

        for (char kalimatLengkap:kalimat) {
            for (int i=0;i<daftarHurufBerlubangSatu.length;i++){
                if (kalimatLengkap==daftarHurufBerlubangSatu[i]){
                    jumlah++;
                }
            }
            for (int i=0;i<daftarHurufBelubangDua.length;i++){
                if (kalimatLengkap==daftarHurufBelubangDua[i]){
                    jumlah+=2;
                }
            }
        }
        return jumlah;
    }
}
