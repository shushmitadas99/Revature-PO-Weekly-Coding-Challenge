package com.revature.sep_19;

import java.util.Scanner;

public class SumDigits {

    public static void main(String[] args) {
        int T = 0, sum = 0, digit = 0, number = 0;
        StringBuilder sb = new StringBuilder();

        System.out.println("Please enter the number of test cases followed by the test case inputs:");
        Scanner sc = new Scanner(System.in);

        if(sc.hasNextInt()) {
            T = sc.nextInt();
        }

        while(T --> 0) {
            String str = sc.next();
            char[] ch = str.toCharArray();

            for(char c : ch) {
                if(Character.isDigit(c)) {
                    String digitString = sb.append(c).toString();
                    number = Integer.parseInt(digitString);
                    sum = sum + number % 10;
                    number /= 10;
                }
            }
            System.out.println("Digit String: " + sb);
            System.out.println("Sum of Digits: " + sum);
        }
    }
}
