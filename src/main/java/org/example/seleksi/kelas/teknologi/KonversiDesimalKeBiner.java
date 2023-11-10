package org.example.seleksi.kelas.teknologi;

import java.util.Scanner;

public class KonversiDesimalKeBiner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int desimal = scanner.nextInt();

        StringBuilder binary = new StringBuilder();
        while (desimal > 0) {
            int remainder = desimal % 2;
            binary.insert(0, remainder);
            desimal = desimal / 2;
        }

        System.out.println(binary);
    }
}
