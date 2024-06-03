package com.First5Sections;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String number = scanner.nextLine();
        int length = (number.length());
        int j = length / 2;
        length--;

        boolean isPalindrome = false;

        //123456
        for (int i = 0; i < j; i++) {

            if (number.charAt(i) == number.charAt(length - i)) {
                isPalindrome = true;
                continue;

            } else {
                isPalindrome = false;
                System.out.println(number + " is not a Palindrome");
                break;
            }
        }

        if (isPalindrome) {
            System.out.println(number + " is a Palindrome");

        }

    }

}
