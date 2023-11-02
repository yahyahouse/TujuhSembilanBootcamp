package org.example.arutala.endurance.challenge2;


import java.util.Scanner;

public class BarisBilangan1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] barisBilangan = new int[15];

        int sukuPertama = scanner.nextInt();
        int deret = sukuPertama;
        int selisih=3;
        barisBilangan[0] = sukuPertama;
        for (int i =1;i<barisBilangan.length;i++){
            if (selisih==3){
                barisBilangan[i]=deret+selisih;
                deret+=selisih;
                selisih=4;
            } else if (selisih==4) {
                barisBilangan[i]=deret+selisih;
                deret+=selisih;
                selisih=5;
            } else if (selisih==5) {
                barisBilangan[i]=deret+selisih;
                deret+=selisih;
                selisih=3;
            }
        }

        for (int baris: barisBilangan) {
            System.out.print(baris+" ");
        }
    }
}
