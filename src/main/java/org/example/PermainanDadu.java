package org.example;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class PermainanDadu {
    public static void main(String[] args)  {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int playerPoint = 0, computerPoint = 0, gilaranPlayer =0, giliranComputer =0;
        boolean playerTurn = true;
        System.out.println("Selamat datang di permainan Pig-Like Dice Game");
        while (playerPoint <= 50 && computerPoint <= 50) {
            if (playerTurn) {
                System.out.println("==========================");
                System.out.println("poin player saat ini " + playerPoint);
                int diceRoll = random.nextInt(6) + 1;
                gilaranPlayer +=1;
                System.out.println("putaran yang sudah di lakukan player: "+gilaranPlayer);
                System.out.println("Mendapatkan angka dadu "+diceRoll);
                if (diceRoll == 1) {
                    System.out.println("Anda mendapatkan 1! Giliran Anda berakhir.");
                    playerTurn = false;
                } else {
                    playerPoint += diceRoll;
                    System.out.println("Skor Anda saat ini: " + playerPoint);
                    System.out.println("Apakah Anda ingin melempar lagi? (roll/hold)");
                    String pilih = scan.next();

                    if (pilih.equalsIgnoreCase("hold")) {
                        playerTurn = false;
                    }

                }
            } else {
                System.out.println("=================================");
                System.out.println("Giliran komputer...");
                animateLoading();
                giliranComputer +=1;
                System.out.println("putaran yang sudah di lakukan computer: "+gilaranPlayer);
                int diceRoll = random.nextInt(6) + 1;
                System.out.println("Komputer melempar dadu dan mendapatkan: " + diceRoll);
                if (diceRoll == 1) {
                    System.out.println("Komputer mendapatkan 1! Giliran komputer berakhir.");
                    playerTurn = true;
                } else {
                    computerPoint += diceRoll;
                    System.out.println("Skor komputer saat ini: " + computerPoint);

                    if (computerPoint >= 50) {
                        break;
                    }

                    if (computerPoint >= 20) {
                        System.out.println("Komputer memilih untuk berhenti. Giliran komputer berakhir.");
                        playerTurn = true;
                    }
                }
            }
        }
        System.out.println("=========================");
        System.out.println("Permainan selesai!");
        System.out.println("Skor Anda: " + playerPoint);
        System.out.println("putaran player: "+gilaranPlayer);
        System.out.println("Skor komputer: " + computerPoint);
        System.out.println("putaran computer: "+giliranComputer);
        if (playerPoint > computerPoint) {
            System.out.println("Anda menang!");

        } else if (playerPoint > computerPoint) {
            System.out.println("Komputer menang!");
        } else {
            System.out.println("Permainan berakhir imbang!");
        }


    }
    public static void animateLoading() {
        String animationChars = "|/-\\";

        for (int i = 0; i < 10; i++) {
            System.out.print("Loading " + animationChars.charAt(i % animationChars.length()) + " ");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print("\r");
        }
    }
}
