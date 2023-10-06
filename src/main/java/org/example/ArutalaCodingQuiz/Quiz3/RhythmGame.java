package org.example.ArutalaCodingQuiz.Quiz3;

import java.util.Scanner;

public class RhythmGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String playerName = scanner.next();
        int poinPerfect = scanner.nextInt();
        int poinGreat = scanner.nextInt();
        int poinGood = scanner.nextInt();
        int poinMiss = scanner.nextInt();
        int maxPoin = 100;

        int totalScore = calculateScore(poinPerfect, poinGreat, poinGood, poinMiss);
        int totalMaxScore = calculateTotalMaxScore(100, 0, 0);
        String rank = getRank((double) totalScore / totalMaxScore);

        if (poinPerfect + poinGreat + poinGood + poinMiss == maxPoin) {
            printResult(playerName, totalScore, totalMaxScore, rank);
        }

    }

    public static int calculateScore(int perfectCount, int greatCount, int goodCount, int missCount) {
        int scorePerfect = perfectCount * 100;
        int scoreGreat = greatCount * 80;
        int scoreGood = goodCount * 60;
        int scoreMiss = 0;
        return scorePerfect + scoreGreat + scoreGood + scoreMiss;
    }

    public static int calculateTotalMaxScore(int maxPerfect, int maxGreat, int maxGood) {
        return maxPerfect * 100 + maxGreat * 80 + maxGood * 60;
    }

    public static String getRank(double percentage) {
        if (percentage >= 0.9) {
            return "S (Super)";
        } else if (percentage >= 0.8) {
            return "A (Amazing)";
        } else if (percentage >= 0.7) {
            return "B (Brilliant)";
        } else if (percentage >= 0.6) {
            return "C (Cool)";
        } else {
            return "D (Decent)";
        }
    }

    public static void printResult(String playerName, int totalScore, int totalMaxScore, String rank) {
        System.out.println(totalScore);
        System.out.println(playerName+" peringkat "+rank);
    }
}
