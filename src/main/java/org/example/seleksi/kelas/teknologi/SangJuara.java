package org.example.seleksi.kelas.teknologi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SangJuara {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int jumlahJuaraCatur = scanner.nextInt();
        scanner.nextLine();
        String[] namaJuaraCatur = new String[jumlahJuaraCatur];
        for (int i = 0; i < jumlahJuaraCatur; i++) {
            namaJuaraCatur[i] = scanner.nextLine();
        }
        int jumlahJuaraBulutangkis = scanner.nextInt();
        scanner.nextLine();
        String[] namaJuaraBulutangkis = new String[jumlahJuaraBulutangkis];
        for (int i = 0; i < jumlahJuaraBulutangkis; i++) {
            namaJuaraBulutangkis[i] = scanner.nextLine();
        }

        List<String> namaJuaraList = new ArrayList<>();
        for (String namaJuaraCatur1 : namaJuaraCatur) {
            for (String namaJuaraBulutangkis1 : namaJuaraBulutangkis) {
                if (namaJuaraCatur1.equals(namaJuaraBulutangkis1)) {
                    namaJuaraList.add(namaJuaraCatur1);
                }
            }
        }
        if (namaJuaraList.isEmpty()){
            System.out.println("tidak ada sang juara");
            return;
        }
        namaJuaraList.sort(Collections.reverseOrder());
        for (String namaJuara : namaJuaraList) {
            System.out.println(namaJuara);
        }
    }
}
