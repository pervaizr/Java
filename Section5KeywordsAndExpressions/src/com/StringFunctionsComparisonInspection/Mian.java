package com.StringFunctionsComparisonInspection;

public class Mian {
    public static void main(String[] args) {
        String myString = "Hello World";
        System.out.println(myString.length());

        System.out.println(myString.charAt(6));

        System.out.println(myString.toLowerCase());
        System.out.println(myString.indexOf('W'));
        System.out.println(myString.lastIndexOf('l'));


        System.out.printf("Print the length of string %d %n", myString.length());
        System.out.printf("Print the length of string %c %n", myString.charAt(0));
        System.out.printf("Print the length of string %c %n", myString.charAt(myString.length() -1));

        System.out.printf("Print the index of World = %d %n", myString.indexOf("World", 1));

        if (myString.equals("hello world")){
            System.out.println("Exact Match - Case sensitive ");
        } else if (myString.equalsIgnoreCase(("hello world"))) {
            System.out.println("Matching after changing to lower case ");
        }

        if(myString.startsWith("Hello")){
            System.out.println("String starting with Hello");
        } else if (myString.endsWith("World")){
            System.out.println("String  end with World");
        } else {
            System.out.println("Not starting with Hello nor ending with World");
        }


    }
}
