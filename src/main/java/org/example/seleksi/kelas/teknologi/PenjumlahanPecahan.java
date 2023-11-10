package org.example.seleksi.kelas.teknologi;

import java.util.Scanner;

public class PenjumlahanPecahan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bilanganA = scanner.nextInt();
        int bilanganB = scanner.nextInt();
        int bilanganC = scanner.nextInt();
        int bilanganD = scanner.nextInt();

        int pembilang = (bilanganA * bilanganD) + (bilanganB * bilanganC);
        int penyebut = bilanganB * bilanganD;
        int FPB = calculateFPB(pembilang, penyebut);
        pembilang /= FPB;
        penyebut /= FPB;

        System.out.println(pembilang + " " + penyebut);


    }
    public static int calculateFPB(int angkaA, int angkaB) {
        while (angkaB != 0) {
            int temp = angkaB;
            angkaB = angkaA % angkaB;
            angkaA = temp;
        }
        return angkaA;
    }
}
