package org.example.tujuhSembilan;

import java.util.Scanner;

public class MencariArray2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer[] angka = {3,2,5,11,7,10,11,3,15,11,17,10,5};
        boolean lanjut = true;
        while (lanjut){
            for (Integer angkas:angka) {
                System.out.print(angkas+", ");
            }
            System.out.println();
            System.out.println("masukan index yang mau di ganti (1-13) ");
            Integer index = scanner.nextInt()-1;
            System.out.println("masukan nilai yang ingin di ganti");
            Integer ganti = scanner.nextInt();
            for (int i =0; i<angka.length;i++){
                if (i==index){
                    angka[i] = ganti;
                }
            }
            System.out.println("Setelah di ganti");
            for (Integer angkas:angka) {
                System.out.print(angkas+", ");
            }
            System.out.println();
            System.out.println("apakah lanjut ? (y/n)");
            String pilihan = scanner.next();
            if (pilihan.equalsIgnoreCase("n")){
                lanjut = false;
            }
        }
    }
}
