package org.example.seleksi.kelas.teknologi;

import java.util.Scanner;

public class DiBawahRataRata {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int jumlahSiswa = scanner.nextInt();
        int[] nilai = new int[jumlahSiswa];
        for (int i = 0; i < nilai.length; i++) {
            nilai[i] = scanner.nextInt();
        }
        int nilaiSeluruhSiswa = 0;
        for (int nilaiSiswa : nilai) {
            nilaiSeluruhSiswa += nilaiSiswa;
        }
        double rataRata = (double) nilaiSeluruhSiswa / jumlahSiswa;
        int total = 0;
        for (int nilaiSiswa : nilai) {
            if (nilaiSiswa<rataRata){
                total++;
            }
        }
        System.out.print(total);
    }
}
