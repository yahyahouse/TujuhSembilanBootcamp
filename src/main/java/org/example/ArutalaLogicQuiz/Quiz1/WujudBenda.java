package org.example.ArutalaLogicQuiz.Quiz1;

import java.util.Scanner;

public class WujudBenda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double suhu = scanner.nextDouble();
        mengetahuiBentukBenda(suhu);
        scanner.close();
    }
    public static void mengetahuiBentukBenda(double suhu){
        double suhuMaxCair=100;
        double suhuMinCair=0;
        if (suhu >= suhuMinCair && suhu <= suhuMaxCair) {
            System.out.print("berwujud cair");
        } else {
            System.out.print("berwujud non cair");
        }
    }
}
