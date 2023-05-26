package org.example;

import java.util.Scanner;

public class CalculateMonetSpent {
    public static void main(String[] args) {
        String name;
        Integer moneySpent;
        Double average;
        Integer total, totalDay;
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukan Nama");
        name = scan.nextLine();
        System.out.println("Pengeluaran club pada hari Senin ");
        moneySpent = scan.nextInt();
        System.out.println("Pengeluaran club pada hari Selasa ");
        moneySpent = moneySpent + scan.nextInt();
        System.out.println("Pengeluaran club pada hari Rabu ");
        moneySpent = moneySpent + scan.nextInt();
        System.out.println("Pengeluaran club pada hari Kamis ");
        moneySpent = moneySpent + scan.nextInt();
        System.out.println("Pengeluaran club pada hari Jumat ");
        moneySpent = moneySpent + scan.nextInt();
        System.out.println("Pengeluaran club pada hari Sabtu ");
        moneySpent = moneySpent + scan.nextInt();
        System.out.println("Pengeluaran club pada hari Minggu ");
        moneySpent = moneySpent + scan.nextInt();

        System.out.println("Menghitung hasil");
        System.out.println("Hallo "+name);
        System.out.println("Total pengeluaran pada minggu ini yaitu "+moneySpent);
        System.out.println("Dengan rata rata setiap harinya yaitu "+moneySpent/7);
    }
}
