package org.example.arutala.endurance.challenge;

import java.util.Scanner;

public class Matriks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ukuranMatriks = scanner.nextInt();
        mencetakMatriks(ukuranMatriks);
        scanner.close();

    }
    public static void mencetakMatriks(int ukuranMatriks){
        for (int i= 0;i<ukuranMatriks;i++){
            for (int j =0;j<ukuranMatriks;j++){
                if (i==j){
                    System.out.print(1);
                }else {
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    }
}
