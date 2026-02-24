package baekjun;

import java.util.Scanner;

public class No4344 {

    public static void main(String[] args) {
        int inputCaseCount;
        Scanner sc = new Scanner(System.in);
        inputCaseCount = sc.nextInt();
        double[] averages = new double[inputCaseCount];

        for (int i = 0; i < inputCaseCount; i++) {

            int studentCount = sc.nextInt();
            int[] studentGrades = new int[studentCount];
            int studentGradeSum = 0;
            for (int j = 0; j < studentCount; j++) {
                studentGrades[j] = sc.nextInt();
            }

            double averageOfGrades = averageOfGrades(studentGrades);
//            System.out.println("debug ::: " + averageOfGrades);
            double countOfStudentsOverAverage = countOfStudentsOverAverage(studentGrades, averageOfGrades);
//            System.out.println("debug ::: " + countOfStudentsOverAverage);
            averages[i] = getPercentage(countOfStudentsOverAverage, studentCount);
        }

        for (double average : averages) {
            System.out.println(average + "%");
        }
    }


    private static long averageOfGrades(int[] studentGrades) {
        int sumOfGrades = 0;
        for (int grade : studentGrades) {
            sumOfGrades += grade;
        }
        return sumOfGrades / studentGrades.length;
    }

    private static double countOfStudentsOverAverage(int[] studentGrades, double averageOfGrade) {
        double countOfStudentOverAverage = 0;
        for (int grade : studentGrades) {
            if (grade > averageOfGrade) {
                countOfStudentOverAverage++;
            }
        }
        return countOfStudentOverAverage;
    }

    private static double getPercentage(double countOfStudentOverAverage, int studentCount) {
        return countOfStudentOverAverage * 100 / studentCount;
    }
}
