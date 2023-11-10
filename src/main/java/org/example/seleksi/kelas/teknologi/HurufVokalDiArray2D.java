package org.example.seleksi.kelas.teknologi;

import java.util.Scanner;

public class HurufVokalDiArray2D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] huruf = new char[3][3];
        for (int i=0;i<huruf.length;i++) {
            for (int j=0;j<huruf[i].length;j++) {
                huruf[i][j] = scanner.next().charAt(0);
            }
        }

        int cek=0;
        for (int i=0;i<huruf.length;i++) {
            for (int j=0;j<huruf[i].length;j++) {
                if (huruf[i][j] == 'a' || huruf[i][j] == 'i' || huruf[i][j] == 'u' || huruf[i][j] == 'e' || huruf[i][j] == 'o'||
                        huruf[i][j] == 'A' || huruf[i][j] == 'I' || huruf[i][j] == 'U' || huruf[i][j] == 'E' || huruf[i][j] == 'O'
                ) {
                    int a= i+1;
                    int b= j+1;
                    System.out.println(huruf[i][j] + ": ("+a+","+b+")");
                    cek++;
                }
            }
        }
        if (cek==0) {
            System.out.println("tidak ada huruf vokal");
        }
    }
}
