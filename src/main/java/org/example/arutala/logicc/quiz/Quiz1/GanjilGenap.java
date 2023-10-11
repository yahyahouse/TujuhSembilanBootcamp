package org.example.arutala.logicc.quiz.Quiz1;

import java.util.Scanner;

public class GanjilGenap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bilangan = scanner.nextInt();
        System.out.print(mengetahuiBilanganGanjilGenap(bilangan));

        scanner.close();
    }
    public static String mengetahuiBilanganGanjilGenap(int bilangan){
        String hasil;
        if (bilangan % 2 == 0) {
            hasil ="genap";
        } else {
            hasil="ganjil";
        }
        return hasil;
    }
}
