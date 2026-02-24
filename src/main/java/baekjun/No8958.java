package baekjun;

import java.util.Scanner;

public class No8958 {

    public static void main(String[] args) {

        int inputCount;
        Scanner sc = new Scanner(System.in);
        inputCount = sc.nextInt();
        String[] inputOXQuiz = new String[inputCount];

        for (int i = 0; i < inputCount; i++) {
            inputOXQuiz[i] = sc.next();
            int score = getScore(inputOXQuiz[i]);
            System.out.println(score);
        }
    }

    private static int getScore(String OXQuiz) {
        int totalScore = 0;
        int score = 0;
        int sum = 0;
        for (String a : OXQuiz.split("")) {
            if ("O".equals(a)) {
                sum += ++score;
            } else {
                score = 0;
            }
        }

        return sum;
    }
}
