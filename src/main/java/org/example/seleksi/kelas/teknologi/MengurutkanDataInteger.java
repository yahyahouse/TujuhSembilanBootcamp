package org.example.seleksi.kelas.teknologi;

import java.util.Scanner;

public class MengurutkanDataInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int angka1 = scanner.nextInt();
        int angka2 = scanner.nextInt();
        int angka3 = scanner.nextInt();

        int[] arrHasil = new int[3];
        for (int i =0;i< arrHasil.length;i++){
            if (angka1>angka2&&angka1>angka3){
                arrHasil[0] = angka1;
                if (angka2>angka3){
                    arrHasil[1] = angka2;
                    arrHasil[2] = angka3;
                }else {
                    arrHasil[1] = angka3;
                    arrHasil[2] = angka2;
                }
            }else if (angka2>angka1&&angka2>angka3){
                arrHasil[0] = angka2;
                if (angka1>angka3){
                    arrHasil[1] = angka1;
                    arrHasil[2] = angka3;
                }else {
                    arrHasil[1] = angka3;
                    arrHasil[2] = angka1;
                }
            }else if (angka3>angka1&&angka3>angka2){
                arrHasil[0] = angka3;
                if (angka1>angka2){
                    arrHasil[1] = angka1;
                    arrHasil[2] = angka2;
                }else {
                    arrHasil[1] = angka2;
                    arrHasil[2] = angka1;
                }
            }
        }

        for (int hasil:arrHasil){
            System.out.print(hasil+" ");
        }
    }
}
