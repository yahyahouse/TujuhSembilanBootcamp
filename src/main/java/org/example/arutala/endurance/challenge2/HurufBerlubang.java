package org.example.arutala.endurance.challenge2;

import java.util.Scanner;

public class HurufBerlubang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String kata = scanner.next();
        int jumlahLubang=0;
        char[] lubang1 = {'A','D','O','P','R','Q'};
        char[] lubang2 = {'B'};
        for (char huruf :kata.toUpperCase().toCharArray()){
            for (char lubangSatu:lubang1){
                if (lubangSatu==huruf){
                    jumlahLubang++;
                }
            }
            for (char lubangDua:lubang2){
                if (lubangDua==huruf){
                    jumlahLubang+=2;
                }
            }
        }
        System.out.print(jumlahLubang);
    }
}
