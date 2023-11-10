package org.example.learning;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        String[] choices = {"Rock", "Paper", "Scissors"};

        // Membuat objek Scanner untuk input pemain
        Scanner scanner = new Scanner(System.in);

        System.out.println("Mainkan Rock, Paper, Scissors!");
        System.out.println("Pilihan Anda (0=Rock, 1=Paper, 2=Scissors):");

        int playerChoice = scanner.nextInt();
        scanner.close();

        // Menghasilkan pilihan acak komputer
        Random random = new Random();
        int computerChoice = random.nextInt(3);

        System.out.println("Pilihan Anda: " + choices[playerChoice]);
        System.out.println("Pilihan Komputer: " + choices[computerChoice]);

        // Menentukan hasil permainan
        if (playerChoice == computerChoice) {
            System.out.println("Hasil: Seri!");
        } else if ((playerChoice == 0 && computerChoice == 2) || (playerChoice == 1 && computerChoice == 0) || (playerChoice == 2 && computerChoice == 1)) {
            System.out.println("Hasil: Anda menang!");
        } else {
            System.out.println("Hasil: Komputer menang!");
        }
    }
}
