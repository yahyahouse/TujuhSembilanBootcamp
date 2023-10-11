package org.example.tujuhSembilan;

import java.util.Scanner;

public class InfoLoker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("nama : ");
        String nama = scan.next();
        System.out.println("umur : ");
        Integer umur = scan.nextInt();
        System.out.println("jenis kelamin : ");
        String jk = scan.next();
        System.out.println("lulusan : ");
        String lulusan = scan.next();
        System.out.println("pengalaman : ");
        Integer pengalaman = scan.nextInt();
        System.out.println("penampilan (1/10) : ");
        Integer penampilan = scan.nextInt();

        boolean reqKoor1, reqKoor2, reqAdmin1, reqAdmin2;
        reqKoor1 = jk.equalsIgnoreCase("Pria") && umur >= 21 && umur <= 30 && (lulusan.equals("SMK") || lulusan.equals("D3")) && pengalaman >= 2;
        reqKoor2 = jk.equalsIgnoreCase("Pria") && umur >= 30 && lulusan.equals("S1") && pengalaman >= 5;

        reqAdmin1 = jk.equalsIgnoreCase("Wanita") && umur >= 20 && umur <= 25 && lulusan.equals("D3") && (penampilan >= 8.5 || pengalaman >= 1);
        reqAdmin2 = jk.equalsIgnoreCase("Wanita") && umur >= 25 && lulusan.equals("S1") && penampilan >= 8.5 && pengalaman >= 5;

        boolean koor = reqKoor1 || reqKoor2;
        boolean admin = reqAdmin1 || reqAdmin2;
        System.out.println("=======================");

        System.out.println(nama + "terima kasih sudah mendaftar");
        System.out.println("berikut hasil nya");
        System.out.println("koordinator : " + koor);
        System.out.println("Admin : " + admin);
    }
}
