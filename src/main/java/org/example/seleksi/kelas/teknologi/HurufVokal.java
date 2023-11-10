package org.example.seleksi.kelas.teknologi;

import java.util.Scanner;

public class HurufVokal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String kata = scanner.nextLine();
        System.out.println(kata.equalsIgnoreCase("a") || kata.equalsIgnoreCase("i") || kata.equalsIgnoreCase("u") || kata.equalsIgnoreCase("e") || kata.equalsIgnoreCase("o"));
    }
}
