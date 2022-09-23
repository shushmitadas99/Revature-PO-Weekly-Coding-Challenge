package com.revature.sept_19;

import java.util.Scanner;

//Write a program that accepts sets of three numbers and prints the second-maximum number among the three.
public class SecondMaximum {

    public static void main(String[] args) {
        int N=0, num1=0, num2=0, num3=0;
        Scanner sc = new Scanner(System.in);

        if(sc.hasNextInt()) {
            N = sc.nextInt();
        }

        while(N --> 0){ // while condition N > 0, decrement N --
            num1 = sc.nextInt();
            num2 = sc.nextInt();
            num3 = sc.nextInt();

            if ((num1 > num2 && num1 < num3) || (num1 < num2 && num1 > num3)) {
                System.out.println(num1);
            }else if ((num2 > num1 && num2 < num3) || (num2 < num1 && num2 > num3)){
                System.out.println(num2);
            }else if ((num3 > num1 && num3 < num2) || (num3 < num1 && num3 > num2)){
                System.out.println(num3);
            }
        }
    }
}
