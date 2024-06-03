package com.StringManipulationMethods;

public class Main {
    public static void main(String[] args) {

        String myDateOfBirth = "28/01/1984";
        int startingIndex = myDateOfBirth.indexOf("1984");
        System.out.println("Year of the Birth =" + myDateOfBirth.substring(startingIndex));

        System.out.println("Month of the Birth =" + myDateOfBirth.substring(3,5));

        String newDate = String.join("/", "28","01","1984");
        System.out.println("New Formatted DOB = " + newDate);
        //this can be done using concatinate but tedious
        System.out.println(newDate.replace("/", "-"));

        System.out.println(newDate.replaceFirst("/", "-"));
        System.out.println(newDate.replaceAll("/", "---"));

        System.out.println("ABC\n".repeat(3));
        System.out.println("-".repeat(10));
        System.out.println("ABC\n".repeat(3).indent(5));
        System.out.println("    ABC\n".repeat(3).indent(-2));

    }
}
