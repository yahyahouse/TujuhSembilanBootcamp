package org.example.arutala.endurance.challenge;


import java.util.Scanner;

public class WujudBenda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double suhuBenda = scanner.nextDouble();
        System.out.print(menentukanWujudBenda(suhuBenda));
        scanner.close();
    }
    public static String menentukanWujudBenda(double suhuBenda){
        String bentukBenda ="";
        if (suhuBenda>=0&&suhuBenda<=100){
            bentukBenda="berwujud cair";
        }else {
            bentukBenda ="berwujud non cair";
        }
        return bentukBenda;
    }
}
