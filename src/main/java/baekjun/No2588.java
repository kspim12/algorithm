package baekjun;

import java.util.Scanner;

public class No2588 {

    public static void main(String[] args) {
        int A; //472
        int B; //385
        Scanner sc = new Scanner(System.in);
        A = sc.nextInt();
        B = sc.nextInt();

        int line_1 = A * (B % 10);
        int line_2 = A * ((B % 100) / 10);
        int line_3 = A * (B / 100);

        System.out.println(line_1);
        System.out.println(line_2);
        System.out.println(line_3);

        System.out.println(line_1 + line_2 * 10 + line_3 * 100);
    }
}
