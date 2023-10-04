package org.example.ArutalaCodingQuiz.Quiz2;

import java.util.Scanner;

public class HitungIpkDanYudisium {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] arrNamaModule;
        String[] arrHarkat;
        int[] arrSks;
        int[] arrScore;

        String statusYudisium;
        int banyakModule;
        double ipk;
        double totalSks;
        double totalScore;
        boolean isPending;

        //Input banyak module
        banyakModule = input.nextInt();

        //inisialisasi semua Array yang dibutuhkan berdasarkan Banyak module
        arrNamaModule = new String[banyakModule];
        arrHarkat = new String[banyakModule];
        arrScore = new int[banyakModule];
        arrSks = new int[banyakModule];

        for (int i = 0; i < arrNamaModule.length; i++) {
            arrNamaModule[i] = input.next();
            arrSks[i] = input.nextInt();
            arrHarkat[i] = input.next();
            arrScore[i] = convertHarkat(arrHarkat[i]) * arrSks[i];
        }

        totalScore = calculateTotalValue(arrScore);
        totalSks = calculateTotalValue(arrSks);
        ipk = calculateIpk(totalSks, totalScore);
        isPending = isPendingValildation(arrHarkat);
        statusYudisium = getYudisium(isPending, ipk);
        //print hasil
        printHasil(ipk, totalSks, statusYudisium, arrNamaModule, arrHarkat);
        input.close();
    }

    public static int convertHarkat(String harkat) {
        int value = 0;
        switch (harkat) {
            case "A":
                value = 4;
                break;
            case "B":
                value = 3;
                break;
            case "C":
                value = 2;
                break;
            case "D":
                value = 1;
                break;
            case "E":
                value = 0;
                break;
        }
        return value;
    }

    public static String getYudisium(boolean isPending, double ipk) {
        String statusYudisium = "";
        if (ipk >= 3.5 && !isPending) {
            statusYudisium = "Cum Laude";
        } else if (ipk < 3.5 && ipk >= 2.75 && !isPending) {
            statusYudisium = "Sangat Memuaskan";
        } else if (ipk < 2.75 && ipk >= 2.0 && !isPending) {
            statusYudisium = "Memuaskan";
        } else {
            statusYudisium = "Pending";
        }
        return statusYudisium;
    }

    public static double calculateIpk(double totalSks, double totalScore) {
        double ipk = 0;
        ipk = totalScore / totalSks;
        return ipk;
    }

    public static boolean isPendingValildation(String[] arrHarkat) {
        boolean isPending = false;
        for (String arr : arrHarkat) {
            if (arr.equals("E")) {
                isPending = true;
                break;
            }
        }
        return isPending;
    }

    public static int calculateTotalValue(int[] arrValue) {
        int total = 0;
        for (int arr : arrValue) {
            total += arr;
        }
        return total;
    }

    public static void printHasil(double ipk, double totalSks, String statusYudisium, String[] arrModule, String[] arrHarkat) {
        int number = 1;

        System.out.println("Yudisium: " + statusYudisium);
        System.out.print("IPK: ");
        System.out.printf("%.2f", ipk);
        System.out.println();
        System.out.println("Total SKS: " + totalSks);
        System.out.println("Total Module: " + arrModule.length);
        for (int i = 0; i < arrModule.length; i++) {
            System.out.println(number++ + ". " + arrModule[i] + " (" + arrHarkat[i] + ")");
        }
    }
}
