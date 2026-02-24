package baekjun;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class No10871 {

    public static void main(String[] args) {
        int inputCount;
        int inputStandard;


        Scanner scan = new Scanner(System.in);
        inputCount = scan.nextInt();
        inputStandard = scan.nextInt();

        int[] inputArray = new int[inputCount];
        List<Integer> returnList = new ArrayList<>();

        for (int i = 1; i <= inputCount; i++) {
            inputArray[i - 1] = scan.nextInt();
            if (inputArray[i - 1] < inputStandard) {
                returnList.add(inputArray[i - 1]);
            }
        }

        for (int i : returnList) {
            System.out.print(i + " ");
        }

    }
}
