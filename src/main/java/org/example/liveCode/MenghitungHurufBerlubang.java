package org.example.liveCode;


import java.util.Scanner;

public class MenghitungHurufBerlubang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String kata = scanner.nextLine();

        char[] huruf = kata.toUpperCase().toCharArray();
        int jumlah = 0;
        for (int i = 0; i< huruf.length; i++){
            if (huruf[i]=='A'||huruf[i]=='D'||huruf[i]=='O'||huruf[i]=='P'||huruf[i]=='Q'||huruf[i]=='R'){
                jumlah+=1;
            } else if (huruf[i]=='B') {
                jumlah+=2;
            }else {
                jumlah+=0;
            }
        }
        System.out.print(jumlah);
        scanner.close();
    }
}
