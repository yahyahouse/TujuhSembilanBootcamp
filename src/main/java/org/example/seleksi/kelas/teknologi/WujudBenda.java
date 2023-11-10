package org.example.seleksi.kelas.teknologi;

import java.util.Scanner;

public class WujudBenda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double suhu = scanner.nextDouble();
        if (suhu>=0 && suhu<=100) {
            System.out.println("berwujud cair");
        }else {
            System.out.println("berwujud non cair");
        }
    }
}
