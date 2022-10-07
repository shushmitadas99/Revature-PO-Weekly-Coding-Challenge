package com.revature.oct_03;

public class ValidPin {

    public static boolean validate(String str){
        if (str.matches("[0-9]+") && str.contains(".*[a-zA-Z].*") == false
                && str != null && !str.isEmpty() && !str.trim().isEmpty()
                && str.length() == 4 || str.length() == 6) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println("121317: " + validate("121317"));   // true
        System.out.println("1234: " + validate("1234"));     // true
        System.out.println("45135: " + validate("45135"));    // false
        System.out.println("89abc1: " + validate("89abc1"));   // false
        System.out.println("900876: " + validate("900876"));   // true
        System.out.println(" 4983: " + validate(" 4983"));    // false
        System.out.println("\"\": " + validate(""));    // false
    }
}
