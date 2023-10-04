package org.example.ArutalaLogicQuiz.Quiz3;

import java.util.Scanner;

public class MaksimalTigaBilangan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] bilangan = new int[3];

        for (int i = 0;i<bilangan.length;i++){
            bilangan[i] = scanner.nextInt();
        }
        System.out.print(mencariBilanganMaksimal(bilangan));
        scanner.close();
    }

    public static int mencariBilanganMaksimal(int[] bilangan){
        int nilaiTerbesar = bilangan[0];
        for (int i = 1; i < bilangan.length; i++) {
            if (bilangan[i] > nilaiTerbesar) {
                nilaiTerbesar = bilangan[i];
            }
        }

        return nilaiTerbesar;
    }
}
