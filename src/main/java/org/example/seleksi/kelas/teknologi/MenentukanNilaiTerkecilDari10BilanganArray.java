package org.example.seleksi.kelas.teknologi;

import java.util.Scanner;

public class MenentukanNilaiTerkecilDari10BilanganArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr1 = new int[10];
        int[] arr2 = new int[10];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = scanner.nextInt();
        }
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = scanner.nextInt();
        }

        System.out.print(menentukanBilanganTerbesar(arr1)+" ");
        System.out.println(menentukanBilanganTerbesar(arr2));

    }

    public static int menentukanBilanganTerbesar(int[] arr1) {
        int min = arr1[0];
        for (int j : arr1) {
            if (j < min) {
                min = j;
            }
        }
        return min;
    }
}
