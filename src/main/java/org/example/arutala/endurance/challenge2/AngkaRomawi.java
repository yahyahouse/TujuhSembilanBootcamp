package org.example.arutala.endurance.challenge2;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AngkaRomawi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int angkaBiasa = scanner.nextInt();
        StringBuilder angkaRomawi= new StringBuilder();
        Map<Integer,String> arrAngkaRomawi = new LinkedHashMap<>();
        arrAngkaRomawi.put(1000, "M");
        arrAngkaRomawi.put(900, "CM");
        arrAngkaRomawi.put(500, "D");
        arrAngkaRomawi.put(400, "CD");
        arrAngkaRomawi.put(100, "C");
        arrAngkaRomawi.put(90, "XC");
        arrAngkaRomawi.put(50, "L");
        arrAngkaRomawi.put(40, "XL");
        arrAngkaRomawi.put(10, "X");
        arrAngkaRomawi.put(9, "IX");
        arrAngkaRomawi.put(5, "V");
        arrAngkaRomawi.put(4, "IV");
        arrAngkaRomawi.put(1, "I");

        for (Map.Entry<Integer, String> entry : arrAngkaRomawi.entrySet()) {
            int nilai = entry.getKey();
            String romawi = entry.getValue();
            while (angkaBiasa>=nilai){
                angkaRomawi.append(romawi);
                angkaBiasa-=nilai;
            }
        }
        System.out.println(angkaRomawi);
    }
}
