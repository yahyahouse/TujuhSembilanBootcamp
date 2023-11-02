package org.example.arutala.endurance.challenge2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TeksAlay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String kalimat = scanner.nextLine();
        if (kalimat.toCharArray().length>50){
            System.out.println("maksimal 50 kata");
            return;
        }
        char[] huruf = kalimat.toCharArray();
        Map<Character,Character> kamusAlay = new HashMap<>();
        kamusAlay.put('a','4');kamusAlay.put('A','4');
        kamusAlay.put('i','1');kamusAlay.put('I','1');
        kamusAlay.put('z','2');kamusAlay.put('Z','2');
        kamusAlay.put('e','3');kamusAlay.put('E','3');
        kamusAlay.put('g','6');kamusAlay.put('G','6');
        kamusAlay.put('j','7');kamusAlay.put('J','7');
        kamusAlay.put('b','8');kamusAlay.put('B','8');
        for (char hurufs:huruf){
            for (char key:kamusAlay.keySet()){
                if (hurufs==key){
                    hurufs=kamusAlay.get(key);
                }
            }
            System.out.print(hurufs);
        }
    }
}
