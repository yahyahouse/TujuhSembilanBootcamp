package org.example.arutala.coding.quiz.quiz6;

import java.util.*;

public class KarakteristikHewan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double batasKesamaan = scanner.nextDouble();
        String tipeKarakterHewanA = scanner.next();
        scanner.nextLine();
        String tipeKarakterHewanB = scanner.next();
        scanner.nextLine();

        if (hitungPersentaseKesamaan(tipeKarakterHewanA, tipeKarakterHewanB) >= batasKesamaan) {
            System.out.print("sama");
        } else {
            System.out.print("tidak sama");
        }

        scanner.close();

    }

    public static double hitungPersentaseKesamaan(String ciriHewanA, String ciriHewanB) {
        Map<Character, String> daftarCiriHewan = new HashMap<>();
        daftarCiriHewan.put('k', "karnivora");
        daftarCiriHewan.put('h', "herbivora");
        daftarCiriHewan.put('o', "omnivora");
        daftarCiriHewan.put('d', "darat");
        daftarCiriHewan.put('a', "air");
        daftarCiriHewan.put('u', "udara");
        daftarCiriHewan.put('b', "bertelur");
        daftarCiriHewan.put('m', "melahirkan");

        Set<Character> setCiriHewanA = new HashSet<>();
        for (char c : ciriHewanA.toCharArray()) {
            setCiriHewanA.add(c);
        }

        Set<Character> setCiriHewanB = new HashSet<>();
        for (char c : ciriHewanB.toCharArray()) {
            setCiriHewanB.add(c);
        }

        Set<Character> setKesamaan = new HashSet<>(setCiriHewanA);
        setKesamaan.retainAll(setCiriHewanB);

        return ((double) setKesamaan.size() / Math.max(setCiriHewanA.size(), setCiriHewanB.size())) * 100.0;
    }
}
