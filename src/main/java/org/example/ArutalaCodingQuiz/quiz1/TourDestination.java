package org.example.ArutalaCodingQuiz.quiz1;

import java.util.Scanner;

public class TourDestination {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int banyakOrang = scanner.nextInt();
        int lamaMenginap = scanner.nextInt();
        int budget = scanner.nextInt();
        rekomendasitujuan(banyakOrang, lamaMenginap, budget);

        scanner.close();
    }

    public static void rekomendasitujuan(int banyakOrang, int lamaMenginap, int budget) {
        String recommendedDestination = "";


        // Destination: Lombok
        int lombokTransportationCost = 2170000 * banyakOrang;
        int lombokAccommodationCost = 125000 * banyakOrang * lamaMenginap;
        int lombokCulinaryCost = 75000 * banyakOrang * lamaMenginap;
        int lombokSnorklingCost = 250000 * banyakOrang;

        int lombokTotalCost = lombokTransportationCost + lombokAccommodationCost + lombokCulinaryCost + lombokSnorklingCost;


        // Destination: Bangkok
        int bangkokTransportationCost = 3780000 * banyakOrang;
        int bangkokAccommodationCost = 155000 * banyakOrang * lamaMenginap;
        int bangkokCulinaryCost = 55000 * banyakOrang * lamaMenginap;
        int bangkokShoppingCost = 300000 * banyakOrang;

        int bangkokTotalCost = bangkokTransportationCost + bangkokAccommodationCost + bangkokCulinaryCost + bangkokShoppingCost;

        // Destination: Singapura
        int singapuraTransportationCost = 1200000 * banyakOrang;
        int singapuraAccommodationCost = 170000 * banyakOrang * lamaMenginap;
        int singapuraCulinaryCost = 85000 * banyakOrang * lamaMenginap;
        int singapuraUniversalStudioCost = 360000 * banyakOrang;

        int singapuraTotalCost = singapuraTransportationCost + singapuraAccommodationCost + singapuraCulinaryCost + singapuraUniversalStudioCost;


        // Destination: Tokyo
        int tokyoTransportationCost = 4760000 * banyakOrang;
        int tokyoAccommodationCost = 170000 * banyakOrang * lamaMenginap;
        int tokyoCulinaryCost = 105000 * banyakOrang * lamaMenginap;
        int tokyoSkiCost = 325000 * banyakOrang;

        int tokyoTotalCost = tokyoTransportationCost + tokyoAccommodationCost + tokyoCulinaryCost + tokyoSkiCost;

        String[] destinations = {"Singapura", "Bangkok", "Lombok", "Tokyo"};
        double[] totalCosts = {singapuraTotalCost, bangkokTotalCost, lombokTotalCost, tokyoTotalCost};

        int tempCostDifference= Integer.MAX_VALUE;
        int totalBudget = 0;
        
        for (int i = 0; i < destinations.length; i++) {
            double costDifference = Math.abs(totalCosts[i] - budget);
            if (costDifference < tempCostDifference) {
                recommendedDestination = destinations[i];
                tempCostDifference = (int) costDifference;
                totalBudget= (int) totalCosts[i];
            }
        }

        if (!recommendedDestination.isEmpty()) {
            System.out.println(recommendedDestination + " " + totalBudget);
        } else {
            System.out.println("Need more budget");
        }
    }


}
