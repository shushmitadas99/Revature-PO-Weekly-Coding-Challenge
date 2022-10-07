package com.revature.oct_03;

import java.util.Scanner;

public class IntegerFactorial {

    public static boolean isFactorial(int n)
    {
        for (int i = 1;; i++)
        {
            if (n % i == 0) {
                n /= i;
            } else {
                break;
            }
        }

        if (n == 1) {
            return true;
        } else {
            return false;
        }
    }

    public static void main (String[] args)
    {
        char choice = 'a';
        while (choice != 'n') {
            System.out.println("Would you like to find out if an integer is a factorial of a number? \n Enter[y/n]: ");
            Scanner s = new Scanner(System.in);
            choice = s.next().charAt(0);

            System.out.println("Enter an integer: ");
            Scanner sc = new Scanner(System.in);
            int num = Integer.parseInt(sc.nextLine());
            System.out.println(isFactorial(num));
        }
    }
}
