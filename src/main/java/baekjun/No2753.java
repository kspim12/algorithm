package baekjun;

import java.util.Scanner;

public class No2753 {

    public static void main(String[] args) {
        int input;
        Scanner sc = new Scanner(System.in);
        input = sc.nextInt();

        //100의 배수가 아니거나 400의 배수이면 윤년
        //2012 : 4의 배수이지만 100의 배수가 아님 O
        //2000 : 100의 배수이지만 400의 배수이므로 O
        //1900 : 4의 배수, 100의 배수, 400의 배수 X

        if (input % 4 == 0) {
            if (input % 100 == 0) {
                if (input % 400 == 0) {
                    System.out.println(1);
                } else {
                    System.out.println(0);
                }
            } else {
                System.out.println(1);
            }
        } else {
            System.out.println(0);
        }
    }
}
